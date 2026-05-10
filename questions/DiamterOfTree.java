package questions;


public class DiamterOfTree {
    static int height(TreeNode root){
        if(root==null)
            return 0;
        int left=height(root.left);
        int right=height(root.right);
        return Math.max(left, right)+1;
    }
    static int diameter(TreeNode root){
        if(root==null)
            return 0;
        int left=height(root.left);
        int right=height(root.right);

        return Math.max(left+right,
            Math.max(diameter(root.left), diameter(root.right))
        );
    }
    public static void main(String[] args) {
         TreeNode root = new TreeNode(5);
        root.left = new TreeNode(8);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
      	root.right.left = new TreeNode(9);

        System.out.println(diameter(root));
    }


}
