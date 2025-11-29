package questions;

import java.util.ArrayList;
import java.util.List;

public class MorrisTraversal {
    public List<Integer> morrisTraversal(TreeNode root){
        List<Integer> ans=new ArrayList<>();

        TreeNode curr=root;
        while(curr!=null){
            if(curr.left==null){
                ans.add(curr.val);
                curr=curr.right;
            }else{
                // find inorder predecessor
                TreeNode prev=curr.left;
                while(prev.right!=null && prev.right!=curr){
                    prev=prev.right;
                }

                if(prev.right==null){
                    prev.right=curr;
                    curr=curr.left;
                }else{
                    prev.right=null;
                    ans.add(curr.val);
                    curr=curr.right;
                }
            }
        }
        return ans;
    }
    public List<Integer> reverseMorrisTraversal(TreeNode root){
        List<Integer> ans=new ArrayList<>();

        TreeNode curr=root;
        while(curr!=null){
            if(curr.right==null){
                ans.add(curr.val);
                curr=curr.left;
            }else{
                TreeNode prev=curr.right;
                while(prev.left!=null && prev.left!=curr){
                    prev=prev.left;
                }
                if(prev.left==null){
                    prev.left=curr;
                    curr=curr.right;
                }else{
                    prev.left=null;
                    ans.add(curr.val);
                    curr=curr.left;
                }
            }
        }
        return ans;
    }
        

    
}
