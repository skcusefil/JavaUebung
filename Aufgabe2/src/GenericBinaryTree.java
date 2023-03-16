
public class GenericBinaryTree<T extends Comparable<T>>{
   class TreeNode{
       T value;
       TreeNode left,right;
       public TreeNode(T value){
           this.value = value;
       }
       public  void add(T value){
           if(value.compareTo(this.value)>0){
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

   TreeNode root = null;
   public void add (T value){
       if(root == null) root = new TreeNode(value);
       else root.add(value);
   }

   public void add(T[] values){
       for(T value:values) add(value);
   }

    @Override public String toString(){
        String result = "";
        if(root != null) result = root.toString();
        return  result;
    }

}
