package questions;

import java.util.LinkedList;
import java.util.Queue;

public class OddEven {
    public int oddEvenDifference(TreeNode root){
        if(root==null)
            return 0;
        Queue<TreeNode > q=new LinkedList<>();
        q.add(root);
        int k=0;
        int even=0;
        int odd=0;
        while(!q.isEmpty()){
            int size=q.size();
            int sum=0;
            for(int i=0;i<size;i++ ){
                TreeNode node=q.poll();
                sum+=node.val;
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            if(k%2==0){
                even+=sum;
            }else{
                odd+=sum;
            }
            k++;
        }
        return even-odd;
    }
}
