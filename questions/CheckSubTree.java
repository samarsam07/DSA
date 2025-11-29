package questions;

public class CheckSubTree {
    public boolean isSubTree(TreeNode root,TreeNode sub){
        if(root==null && sub==null)
            return true;
        if(root==null|| sub ==null)
            return false;

        if(isIdentical(root,sub))
            return true;

        return isSubTree(root.left, sub) || isSubTree(root.right, sub);
    }
    boolean isIdentical(TreeNode r1,TreeNode r2){
        if(r1==null && r2==null)
            return true;
        if(r1==null || r2==null || r1.val!=r2.val)
            return false;
        return isIdentical(r1.left, r2.left)&&isIdentical(r1.right, r2.right);
    }
}
