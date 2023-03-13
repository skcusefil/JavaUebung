public class GenericComplex <Complex extends Comparable<Complex>> {
    class TreeNode{
        Complex value;
        TreeNode left,right;
        public TreeNode(Complex value){
            this.value = value;
        }
        public  void add(Complex value){
            if(value.compareTo(this.value)>0){
                if(right == null) right = new TreeNode(value);
                else right.add(value);
            }else{
                if(left == null) left = new TreeNode(value);
                else left.add(value);
            }
        }


        public boolean contains(Complex value, TreeNode root){
            if(value.compareTo(root.value) == 0){
                return true;
            }else if(value.compareTo(root.value)<0){
                if(root.left == null) return false;
                else return contains(value, root.left);
            }else{
                if(root.right == null) return false;
                else return contains(value,root.right);
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

    TreeNode root = null;
    Complex complex = null;
    public void add (Complex value){
        complex = value;
        if(root == null) root = new TreeNode(complex);
        else root.add(complex);
    }

    public void add(Complex[] values) {
        for (Complex value : values) add(value);
    }

    public boolean contains(Complex value){
        return root.contains(value, root);
    }

    @Override public String toString(){
        String result = "";
        if(root != null) result = root.toString();
        return  result;
    }
}
