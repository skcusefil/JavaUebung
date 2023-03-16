import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class TaskScheduler {
    public static class Task implements Comparable{
        final int startTime;
        final int endTime;

        public Task(int startTime, int endTime){
            this.startTime = startTime;
            this.endTime = endTime;
        }
        @Override
        public int compareTo(Object o) {
            Task t = (Task)o;
            if(this.startTime < t.startTime) return -1;
            else if (this.startTime > t.startTime) return 1;
            else return 0;
        }

        public boolean overlaps(Task o){
            if(o.startTime >= this.endTime) return false;
            if(o.endTime <= this.startTime) return false;
            return true;
        }

        @Override public String toString(){
            return "("+startTime + ","+endTime+"";
        }
    }

    public static class Machine{
        ArrayList<Task> tasks;
        public Machine(){
            tasks = new ArrayList<Task>();
        }
        public void add(Task t){
            tasks.add((t));
        }

        public boolean conflicts(Task other){
            for(Task t: tasks){
                if(t.overlaps(other)) return true;
            }
            return false;
        }

        @Override public String toString(){
            String result = "";
            for(var t : tasks) result += t.toString() + " ";
            return result;
        }
    }

    public  static void main(String args[]){
        var tasks = new PriorityQueue<Task>();
        var machines = new ArrayList<Machine>();

        //Beispiel: Angenommen, es seien sieben Tasks ti
        //,i = 0,...,6 mit ihren Start- und Endzeiten
        //wie folgt gegeben:
        //t0 = (1,3), t1 = (1,4), t2 = (2,5), t3 = (3,7), t4 = (4,7), t5 = (6,9), t6 = (7,8)
        var t0 = new Task(1,3);
        var t1 = new Task(1,4);
        var t2 = new Task(2,5);
        var t3 = new Task(3,7);
        var t4 = new Task(4,7);
        var t5 = new Task(6,9);
        var t6 = new Task(7,8);

        //Die sieben Tasks konnen dann auf drei Maschinen wie folgt verteilt werden: ¨
        //M0: (1,3) (3,7) (7,8)
        //M1: (1,4) (4,7)
        //M2: (2,5) (6,9)
        var m0 = new Machine();
        m0.add(t0);
        m0.add(t3);
        m0.add(t6);

        var m1 = new Machine();
        m1.add(t1);
        m1.add(t4);

        var m2 = new Machine();
        m2.add(t2);
        m2.add(t5);

        machines.addAll(List.of(m0,m1,m2));

        //a) fuge alle Tasks in eine Priorit ¨ atenwarteschlange ¨ T ein
        tasks.addAll(List.of(t0,t1,t2,t3,t4,t5,t6));

        //b) setze m = 0, wobei m die Anzahl der Maschinen beschreibt
        int m = 0;

        //c) solange T nicht leer ist:
        while (!tasks.isEmpty()){
            //I) entferne den Task ti mit der kleinsten Startzeit aus T
            var t_i = tasks.poll();
            tasks.remove(t_i);
            var newMachine = new Machine();
            for(m=0; m<machines.size();m++){
                var machine = machines.get(m);
                if(!machine.conflicts(t_i)) {
                    //II) falls eine Maschine mj existiert, deren Tasks nicht mit ti kollidieren, fuge den ¨
                    //Task ti der Maschine mj hinzu
                    machine.add(t_i);
                    newMachine = null;
                }else{
                    //III) sonst:
                    //A) fuge eine neue Maschine hinzu ¨
                    //B) fuge den Task ¨ ti der neuen Maschine hinzu
                    newMachine = new Machine();
                    newMachine.add(t_i);
                }
            }
            if(newMachine != null){
                machines.add(newMachine);
            }
        }

        for(var machine:machines){
            System.out.println(machine);
        }
    }
}
