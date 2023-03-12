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

    }
}