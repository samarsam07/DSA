package questions;

// Given the root of Binary Search Tree, transform it into a greater sum tree where each node contains the sum of all nodes greater than that node.
public class BstToGreaterSum {
    public static void transformBST(TreeNode root){
        int sum[]={0};
        updateTree(root,sum);
    }
    public static void updateTree(TreeNode root,int[] sum){
        if(root==null)
            return ;

        updateTree(root.right, sum);
        sum[0]+=root.val;
        root.val=sum[0]-root.val;
        updateTree(root.left, sum);
    }
    
}
