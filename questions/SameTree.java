package questions;

import Queue.reverse;

public class SameTree {
    boolean sameTree(TreeNode r1,TreeNode r2){
        if(r1==null && r2==null)
                return true;
        if(r1==null || r2==null || r1.val!=r2.val)
            return false;
        return sameTree(r1.left, r2.left)&&sameTree(r1.right, r2.right);
    }
    boolean isSymmetric(TreeNode leftSub,TreeNode rightSub){
        if(leftSub==null && rightSub==null)
            return true;
        if(leftSub==null||rightSub==null||leftSub.val!=rightSub.val)
            return false;
        return 
        isSymmetric(leftSub.left, rightSub.right) 
        && 
        isSymmetric(leftSub.right, rightSub.left);
    }
}
