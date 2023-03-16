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
        System.out.println("GenericBinaryTree Complex contains 1.0*i*1.0 ?:"+complex.contains(new Complex(1,1)));
        System.out.println("GenericBinaryTree Complex contains 7.0*i*2.0 ?:"+complex.contains(value1));

        //c) Was mussen Sie tun, damit die Methode ¨ contains im generischen Baum auch fur den ¨
        //Datentyp Complex funktioniert?

    }
}