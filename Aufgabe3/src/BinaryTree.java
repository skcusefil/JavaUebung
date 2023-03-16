import com.sun.source.tree.Tree;

public class BinaryTree {
    class TreeNode{
        final int value;
        TreeNode left,right;
        public TreeNode(int value){
            this.value = value;
        }

        public void add(int value){
            if(value>this.value){
                if(right==null) right = new TreeNode(value);
                else right.add(value);
            }else{
                if(left == null) left = new TreeNode(value);
                else left.add(value);
            }
        }

        //Ergänzen in der Klasse BinaryTree eine Methode
        //public void contains(int value)
        public boolean contains(int value, TreeNode root){
            if(root == null) return  false;

            if(value == root.value) return true;

            return value < root.value
                    ? contains(value,root.left)
                    : contains(value, root.right);
        }
        @Override public String toString(){
            String result = "";
            if(left != null) result = left.toString();
            result += " "+value;
            if(right != null) result += right.toString();

            return result;
        }
    }

    TreeNode root = null;
    public void add(int value){
        if(root == null) root = new TreeNode(value);
        else root.add(value);
    }

    //Ergänzen in der Klasse BinaryTree eine Methode
    //public void contains(int value)
    public boolean contains(int value){
        return root.contains(value, root);
    }
    @Override public String toString(){
        String result = "";
        if(root != null) result = root.toString();
        return result;
    }
}
