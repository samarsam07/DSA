package questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        Map<TreeNode,TreeNode> parent=new HashMap<>();
        q.add(root);
        parent.put(root,null);
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr.left!=null){
                q.add(curr.left);
                parent.put(curr.left,curr);
            }
            if(curr.right!=null){
                q.add(curr.left);
                parent.put(curr.right,curr);
            }
        }
        solve(root,target,k,ans,parent);
        return ans;
    }
    void solve(TreeNode root,TreeNode target,int k,List<Integer> ans,Map<TreeNode,TreeNode> parent){
        if(root==null)
            return;
        if(root==target){
            findNode(root,k,ans,parent);
            return;
        }
        solve(root.left,target,k,ans,parent);
        solve(root.right,target,k,ans,parent);
    }
    void findNode(TreeNode root,int k,List<Integer> ans,Map<TreeNode,TreeNode> parent){
        if(root==null || k<0)
            return;
        if(k==0){
            ans.add(root.val);
            return;
        }
        findNode(root.left,k-1,ans,parent);
        findNode(root.right,k-1,ans,parent);
        findNode(parent.get(root),k-1,ans,parent);
    }
    
}