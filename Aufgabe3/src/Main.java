public class Main {
    public static void main(String[] args) {
        var binaryTree = new BinaryTree();
        binaryTree.add(3);
        binaryTree.add(7);
        binaryTree.add(5);
        binaryTree.add(9);
        binaryTree.add(2);

        System.out.println("BinaryTree values:"+binaryTree);
        System.out.println("BinaryTree contains 1 ? :"+binaryTree.contains(1));
        System.out.println("BinaryTree contains 5 ? :"+binaryTree.contains(5));

        System.out.println("==========================");
        System.out.println("==========================");

        //b) Zeigen Sie, dass die Methode fur die Datentypen ¨ String und Date funktioniert.
        var genericBinaryTree = new GenericBinaryTree<String>();
        genericBinaryTree.add("azbb");
        genericBinaryTree.add("acdb");
        genericBinaryTree.add("acbb");
        genericBinaryTree.add("uabb");
        System.out.println("GenericBinaryTree values:"+genericBinaryTree);
        System.out.println("GenericBinaryTree contains azbb?:"+genericBinaryTree.contains("azbb"));
        System.out.println("GenericBinaryTree contains aaa?:"+genericBinaryTree.contains("aaa"));

        System.out.println("==========================");
        System.out.println("==========================");
        var complex = new GenericComplex();
        var value1 = new Complex(7,2);
        var value2 = new Complex(3,2);
        var value3 = new Complex(1,5);
        var value4 = new Complex(4,2);

        complex.add(value1.abs());
        complex.add(value2.abs());
        complex.add(value3.abs());
        complex.add(value4.abs());

        var falseValue = new Complex(2,2).abs();
        System.out.println("GenericComplexTree values:"+complex);
        System.out.println(String.format("GenericComplexTree contains 2+2i %s ?: %s",falseValue, complex.contains(falseValue)));
        System.out.println(String.format("GenericComplexTree contains 7+2i %s ?: %s",value1.abs(), complex.contains(value1.abs())));

        //c) Was mussen Sie tun, damit die Methode ¨ contains im generischen Baum auch fur den ¨
        //Datentyp Complex funktioniert?
        //Wert von Methode abs() als nummer Type liefern.
    }
}