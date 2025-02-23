import java.util.HashMap;


class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val = x;
        this.left = null;
        this.right = null;
    }
}
public class CreateTree{
    static int index=0;
    public static void main(String[] args) {
        TreeNode root = treeFromInorderAndPreorder(new int[]{4,2,5,1,6,3},new int[]{1,2,4,5,3,6});
                System.out.println("Inorder Traversal");
                inorder(root);
            }
    static void inorder(TreeNode root){
                if(root==null){
                    return;
                }
                inorder(root.left);
                System.out.print(root.val+" ");
                inorder(root.right);
            }
    static TreeNode treeFromInorderAndPreorder(int []inorder,int[] preorder){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<preorder.length;i++){
            map.put(preorder[i],i);
        }
        index=0;
        return buildTree(inorder,preorder,0,inorder.length-1,map);
    }
    static TreeNode buildTree(int[] inorder,int[] preorder,int start,int end,HashMap<Integer,Integer> map){
        if(start>end){
            return null;
        }
        int value=inorder[index++];
        int i = map.get(value);
        TreeNode root = new TreeNode(value);
        root.left = buildTree(inorder,preorder,start,i-1,map);
        root.right = buildTree(inorder,preorder,i+1,end,map);    
        return root;
    }
}