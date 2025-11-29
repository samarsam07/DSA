package questions;

public class InOrderSuccessor {
    public TreeNode inOrderSuccessor(TreeNode root,TreeNode target) {
        TreeNode succ=null;
        while(root!=null){
            if(target.val<root.val){
                succ=root;
                root=root.left;
            }else{
                root=root.right;
            }
        }
        return succ;

    }
}
