public class Main {
    public static void main(String[] args) {

        ///Erganzen Sie die Klasse ¨ Complex so, dass Sie Elemente dieses Typs in den generischen Baum aus
        // Abschnitt 3.2.3 einfugen können. Die Ausgabe des Baums soll dann die enthaltenen komplexen
        // Zahlen nach ihrem Absolutbetrag sortiert ausgeben. Hinweis: Parameterisieren Sie ein GenericTree-Objekt
        // auf den Typen Complex. Der Compiler sollte dann einen Fehler ausgeben, der Ihnen einen Hinweis auf die
        // erforderlichen Erganzungen in der Klasse ¨ Complex liefert.
        //Abschnitt 3.2.3 sieht wie in BinaryTreeBeforeAddingComplex.java aus
        //In BinaryTree habe ich selber weiter inner class Complex gegmacht die Frage ist, ich bin mir nicht sicher ob ich die Frage richtig verstanden habe

        BinaryTree tree = new BinaryTree();
        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(1);
        tree.add(6);
        tree.add(4);
        tree.add(2);
        System.out.println(tree);
    }
}


