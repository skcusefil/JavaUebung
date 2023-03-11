public class Main {
    public static void main(String[] args) {

        BinaryTreeFromAufgabe2 tree = new BinaryTreeFromAufgabe2<Integer>();
        tree.add(2);
        tree.add(10);
        tree.add(5);
        System.out.println(tree.contains(2));

        GenericBinaryTree<String> tree2 = new GenericBinaryTree<String>();
        tree2.add("aba");
        tree2.add("zab");
        tree2.add("ufo");

        System.out.println(tree2);
        System.out.println(tree2.contains("zab"));
    }
}