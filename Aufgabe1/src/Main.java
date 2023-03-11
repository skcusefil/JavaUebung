public class Main {
    public static void main(String[] args) {

        Bruch bruch1 = new Bruch(2, 2);
        Bruch bruch2 = new Bruch(5, 2);

        System.out.println(bruch1); // Ausgabe: 2/3

        Bruch summe = bruch1.add(bruch2);
        System.out.println(summe);
        Bruch produkt = bruch1.multiply(bruch2);
        System.out.println(produkt);
    }
}