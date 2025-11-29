package questions;
import questions.TreeNode;

public class HeightOfTree {
    // Height of tree
    public int height(TreeNode root){
        if(root==null)
                return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }
      public int depth(TreeNode root){
        if(root==null)
                return -1;
        return Math.max(depth(root.left),depth(root.right))+1;
    }
}
