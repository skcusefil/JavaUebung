public class Main {
    public static void main(String[] args) {
        var intTree = new GenericBinaryTree<Integer>();
        intTree.add(new Integer[]{7,1,6,4,2});
        System.out.println(intTree);

        var complex = new GenericComplex();
        var value1 = new Complex(7,2);
        var value2 = new Complex(3,2);
        var value3 = new Complex(1,5);
        var value4 = new Complex(4,2);

        //Hinweis: Parameterisieren Sie ein GenericTree-Objekt auf den Typen Complex.
        // Der Compiler sollte dann einen Fehler ausgeben, der Ihnen einen Hinweis auf die erforderlichen
        //Erganzungen in der Klasse ¨ Complex liefert.

        complex.add(value1.abs());
        complex.add(value2.abs());
        complex.add(value3.abs());
        complex.add(value4.abs());

        System.out.println(complex);
    }
}


