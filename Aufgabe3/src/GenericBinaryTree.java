
//b) Erganzen Sie nun auch in der Klasse ¨ GenericBinaryTree eine Methode
//public  boolean Genericcontains(T value)
public class GenericBinaryTree<T extends Comparable<T>>{
    class TreeNode{
        final T value;
        TreeNode left, right;
        public  TreeNode(T value){
            this.value = value;
        }
        public  void add(T value){
            if(value.compareTo(this.value) > 0){
                if(right == null) right = new TreeNode(value);
                else right.add(value);
            }else{
                if(left == null) left = new TreeNode(value);
                else left.add(value);
            }
        }

        public  boolean contains(T value){
            return value.compareTo(this.value)>0;
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

    public  void add(T value){
        if(root == null) root = new TreeNode(value);
        else root.add(value);
    }

    public  boolean contains(T value){
        return  root.contains(value);
    }
    @Override public  String toString() {
        String result = "";
        if(root != null) complex = new Complex(root);
        return complex.toString();
    }
}
