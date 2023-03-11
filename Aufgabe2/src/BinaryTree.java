import com.sun.source.tree.Tree;

public  class BinaryTree{
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

    @Override public  String toString() {
//        String result = "";
//        if(root != null) result = root.toString();
//        return result;
        String result = "";
        if(root != null) complex = new Complex(root);
        return complex.toString();
    }
}