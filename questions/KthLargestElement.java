package questions;

public class KthLargestElement {
    public int kThLargestElement(TreeNode root,int k){
        int cnt=0;
        TreeNode curr=root;
        while(curr!=null){
            if(curr.right==null){
                cnt++;
                if(cnt==k)return curr.val;

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
                    cnt++;
                    if(cnt==k)return curr.val;
                    curr=curr.left;
                }
            }
        }
        return -1;
    }
}
