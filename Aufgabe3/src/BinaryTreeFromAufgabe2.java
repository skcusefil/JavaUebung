//a) Erganzen Sie in der Klasse ¨ BinaryTree eine Methode
//public  boolean Genericcontains(int value)
//die true zuruckliefert, falls ¨ value in dem Baum enthalten ist, und andernfalls false
//zuruckliefert. ¨
//Zeigen Sie an ein paar Beispielen, dass die Methode funktioniert.
//Hinweis: Erganzen Sie auch in der inneren Klasse ¨ TreeNode eine rekursive Methode
//contains

public class BinaryTreeFromAufgabe2<T extends Comparable<T>> {
    class TreeNode{
        final int value;
        TreeNode left, right;
        public  TreeNode(int value){
            this.value = value;
        }
        public  void add(int value){
            if(value > this.value){
                if(right == null) right = new TreeNode(value);
                else right.add(value);
            }else{
                if(left == null) left = new TreeNode(value);
                else left.add(value);
            }
        }
        public boolean contains(int value){
            return this.value == value;
        }

        @Override public String toString(){
            String result = "";
            if(left != null) result = left.toString();
            result += " "+value;
            if(right != null) result += right.toString();

            return  result;
        }
    }
    class Complex{

        final TreeNode treeNode;
        public Complex(TreeNode root){
            this.treeNode = root;
        }
        @Override public String toString(){
            String result = "";
            if(treeNode != null) result = treeNode.toString();
            return result;
        }
    }

    TreeNode root = null;
    Complex complex = null;

    public  void add(int value){
        if(root == null) root = new TreeNode(value);
        else root.add(value);
    }

    public boolean contains(int value){
        return root.contains(value);
    }

    @Override public  String toString() {
//        String result = "";
//        if(root != null) result = root.toString();
//        return result;
        String result = "";
        if(root != null) complex = new Complex(root);
        return complex.toString();
    }
}


