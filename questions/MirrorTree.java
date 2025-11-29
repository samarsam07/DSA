package questions;

import java.util.LinkedList;
import java.util.Queue;

public class MirrorTree {
    public void changeToMirrorTree(TreeNode root){
        if(root==null)
            return ;
        changeToMirrorTree(root.left);
        changeToMirrorTree(root.right);
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
    }
    public void mirrorTree(TreeNode root){
        if(root==null)
            return;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode curr=q.poll();

            TreeNode temp=curr.left;
            curr.left=curr.right;
            curr.right=temp;

            if(curr.left!=null)
                q.add(curr.left);
            if(curr.right!=null)
                q.add(curr.right);
        }
    }
}
