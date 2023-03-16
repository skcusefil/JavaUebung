public class Main {
    public static void main(String[] args) {
        var intTree = new GenericBinaryTree<Integer>();
        intTree.add(new Integer[]{7,1,6,4,2});
        System.out.println(intTree);

        //Hinweis: Parameterisieren Sie ein GenericTree-Objekt auf den Typen Complex.
        // Der Compiler sollte dann einen Fehler ausgeben, der Ihnen einen Hinweis auf die erforderlichen
        //Erganzungen in der Klasse ¨ Complex liefert.

        var value1 = new Complex(7,2);
        var value2 = new Complex(3,2);
        var value3 = new Complex(1,5);
        var value4 = new Complex(4,2);

        var complex = new GenericBinaryTree<Complex>();
        complex.add(value1);
        complex.add(value2);
        complex.add(value3);
        complex.add(value4);
        System.out.println(complex);


    }
}


