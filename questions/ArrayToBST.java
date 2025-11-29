package questions;

public class ArrayToBST {
    TreeNode arrayToBST(int[] arr){
        return solve(arr,0,arr.length-1);
    }
    TreeNode solve(int[] arr,int s,int e){
        if(s>e)
            return null;
        int mid=s+(e-s)/2;
        TreeNode node=new TreeNode(arr[mid]);
        node.left=solve(arr, s, mid-1);
        node.right=solve(arr, s, mid+1);
        return node;
    }
}
