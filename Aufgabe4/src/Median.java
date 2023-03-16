import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Median {
    public static double median(Double[] values){
        Arrays.sort(values);
        return values[values.length/2];
    }
    public static double fastMedian(List<Double> values, int k){
        //a) falls n = 1, liefere den ersten und einzigen Wert zuruck; dies ist der Median ˜ ¨ x
        int n = values.size();
        if(n == 1){
            return values.get(0);
        }else{
            //b) sonst:
            //I) wahle ein zuf ¨ alliges ¨ xi aus; nenne diesen Wert x
            var random = new Random();
            double x_i = values.get(random.nextInt(values.size()));

            //II) erzeuge drei Listen L, E und G
            ArrayList<Double> L = new ArrayList<>();
            ArrayList<Double> E = new ArrayList<>();
            ArrayList<Double> G = new ArrayList<>();

            //III) fur alle ¨ xi
            //:
            for(var x : values){
                if(x_i<x){
                    //A) falls xi < x, fuge ¨ xi der Liste L hinzu
                    L.add(x);
                }else if(x_i > x){
                    //B) falls xi > x, fuge ¨ xi der Liste G hinzu
                    G.add(x);
                }else{
                    //C) falls xi = x, fuge ¨ xi der Liste E hinzu
                    E.add(x);
                }
            }

            if(k <= L.size()){
                //IV) falls k ≤ |L|: berechne den Median fur¨ L und k (rekursiver Aufruf; |L| bezeichnet
                //die Lange der Liste)
                return fastMedian(L,k);
            }else if(k <= L.size()+E.size()){
                //V) falls k ≤ |L|+|E|: liefere x zuruck; dies ist der Median ˜ ¨ x
                return x_i;
            }else{
                //VI) sonst: berechne den Median fur¨ G und k = k −|L| −|E| (rekursiver Aufruf)
                return fastMedian(G,k-L.size()-E.size());
            }
        }
    }
    public static double fastMedian(Double[] values){
        int k = (values.length+1)/2;
        return fastMedian(Arrays.asList(values),k);
    }

    public static void main(String args[]){
        final int size = 1001;
        Random random  =new Random();
        Double[] values = new Double[size];
        for(int i = 0; i< size;i++) values[i] = random.nextDouble();

        System.out.println(median(values));
        System.out.println(fastMedian(values));

    }
}
