public class Bruch {
    int zaeler;
    int nenner;

    public Bruch(int zaeler, int nenner){
        if (nenner == 0) {
            throw new IllegalArgumentException("Nenner darf nicht null sein");
        }
        this.zaeler = zaeler;
        this.nenner = nenner;
    }

    public int getZahler() {
        return zaeler;
    }

    public int getNenner() {
        return nenner;
    }

    public String toString() {
        if (nenner == 1) {
            return Integer.toString(zaeler);
        } else {
            return zaeler + "/" + nenner;
        }
    }
    public Bruch add(Bruch other) {
        int newNenner = this.nenner * other.nenner;
        int newZahler = this.zaeler * other.nenner + other.zaeler * this.nenner;
        Bruch result = new Bruch(newZahler, newNenner);
        result.kuerzen();
        return result;
    }
    public Bruch multiply(Bruch other) {
        int newZahler = this.zaeler * other.zaeler;
        int newNenner = this.nenner * other.nenner;
        Bruch result = new Bruch(newZahler, newNenner);
        result.kuerzen();
        return result;
    }
    public int ggT(int zaeler, int nenner) {
        if (nenner == 0) {
            return zaeler;
        } else {
            return ggT(nenner, zaeler % nenner);
        }
    }
    public void kuerzen() {
        int ggt = ggT(zaeler, nenner);
        zaeler /= ggt;
        nenner /= ggt;
    }

}
