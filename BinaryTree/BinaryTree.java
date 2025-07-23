import java.util.Scanner;

public class BinaryTree {
    private TreeNode root;
    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    public void  buildTree(Scanner sc){
        System.out.println("enter the value of root node");
        int value=sc.nextInt();
        root=new TreeNode(value);
        populate(sc,root);
    }
    private void populate(Scanner sc,TreeNode root){
        System.out.println("Do you want to enter left of "+root.val);
        boolean left=sc.nextBoolean();
        if(left){
            System.out.println("enter the value of the left of "+root.val);
            int val=sc.nextInt();
            root.left=new TreeNode(val);
            populate(sc, root.left);
        }
        System.out.println("Do you want to enter right of "+root.val);
        boolean right=sc.nextBoolean();
        if(right){
            System.out.println("enter the value of the right of "+root.val);
            int val=sc.nextInt();
            root.right=new TreeNode(val);
            populate(sc, root.right);
        }
    }
    public void display(TreeNode node){
        // inorder
        if(node==null){
            
            return ;
        }
        display(node.left);
        System.out.print(node.val+" ");
        display(node.right);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BinaryTree tree=new BinaryTree();
        tree.buildTree(sc);
        tree.display(tree.root);
    }

}
