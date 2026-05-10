package questions;
// Given a Binary Search Tree (BST) and a range [l, h], the task is to count the number of nodes in the BST that lie in the given range.


public class BSTElementRange {
    static int getCount(TreeNode root,int l,int h){
        if(root==null)
            return 0;

        if(root.val>=l && root.val<=h)
            return 1+getCount(root.left, l, h)+getCount(root.right, l, h);
        else if(root.val<l)
            return getCount(root.right, l, h);
        else
            return getCount(root.left, l, h);
    }
    public static void main(String[] args) {
          //        10
        //       /  \
        //      5   50
        //     /   /  \
        //    1   40  100
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(50);
        root.left.left = new TreeNode(1);
        root.right.left = new TreeNode(40);
        root.right.right = new TreeNode(100);

        int l = 5;
        int h = 45;

        System.out.println(getCount(root, l, h));
    }
}