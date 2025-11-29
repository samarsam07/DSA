package questions;

import java.util.ArrayList;
import java.util.List;

public class BoundaryTraverse {
    public static List<Integer> boundaryTraversal(TreeNode root){
        List<Integer> ans=new ArrayList<>();
        if(root==null)
            return ans;
        if (!isLeaf(root))
            ans.add(root.val);
        collectLeft(root.left, ans);
        collectLeaves(root, ans);
        collectRight(root.right,ans);

        return ans;
    }
    static boolean isLeaf(TreeNode node){
        if(node==null)
            return false;
        if(node.left==null && node.right==null)
            return true;
        return false;
    }
    static void collectLeft(TreeNode root,List<Integer> ans){
        if(root==null || isLeaf(root))
            return;

        ans.add(root.val);
        if(root.left!=null){
            collectLeft(root.left, ans);
        }
        else if(root.right!=null){
            collectLeft(root.right, ans);
        }
    }
    static void  collectLeaves(TreeNode root,List<Integer> ans){
        if(root==null)
            return;
        if(isLeaf(root)){
            ans.add(root.val);
            return;
        }
        collectLeaves(root.left, ans);
        collectLeaves(root.right, ans);
    }
    static void collectRight(TreeNode root,List<Integer> ans){
        if(root==null || isLeaf(root))
            return;

        
        if(root.right!=null){
            collectRight(root.right, ans);
        }
        else if(root.left!=null){
            collectLeft(root.left, ans);
        }
        ans.add(root.val);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        
        root.left.right.left = new TreeNode(8);
        root.left.right.right = new TreeNode(9);

        List<Integer> boundary = boundaryTraversal(root);

        for (int x : boundary)
            System.out.print(x + " ");
    }
    
}
// 1 2 4 8 9 6 7 3 
