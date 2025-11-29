package questions;

import STACK.stacks;

public class CheckSumOfChild {
    public static boolean checkSumOfChild(TreeNode root){
        if(root==null||(root.left==null && root.right==null))
            return true;
        int sum=0;
        if(root.left!=null)
            sum+=root.left.val;
        if(root.right!=null)
            sum+=root.right.val;
        if(sum!=root.val)
            return false;

        return checkSumOfChild(root.left)&&checkSumOfChild(root.right);
    }
}
