import Queue.reverse;

public class SegmentTree {
    static class TreeNode {
        private int value;
        private int startInterval;
        private int endinterval;
        private TreeNode left;
        private TreeNode right;
        TreeNode(int startInterval,int endinterval){
            this.startInterval=startInterval;
            this.endinterval=endinterval;
        }
    }
    TreeNode root;
    public SegmentTree(int[] nums){
        this.root=constructTree(nums,0,nums.length-1);
    }
    private TreeNode constructTree(int[] nums, int i, int j) {
     if(i==j){
        TreeNode leaf=new TreeNode(i, j);
        leaf.value=nums[i];
        return leaf;
     }
     TreeNode node=new TreeNode(i, j);
     int mid=i+(j-i)/2;
     node.left=this.constructTree(nums, i, mid);
     node.right=this.constructTree(nums, mid +1 , j);
     node.value=node.left.value+node.right.value;
     return node;
    }
    public void display(){
        display(this.root);
    }
    private void display(TreeNode node){
        String str="";
        if(node.left!=null){
            str=str +"Interval=["+node.left.startInterval+","+node.left.endinterval+"] and data : "+ node.left.value +" => ";
        }else{
            str=str+"no left child";
        }
        str=str +"Interval=["+node.startInterval+","+node.endinterval+"] and data : "+ node.value +" => ";
        if(node.right!=null){
            str=str +"Interval=["+node.right.startInterval+","+node.right.endinterval+"] and data : "+ node.right.value +" => ";
        }else{
            str=str+"no right child";
        }
        System.out.println(str);
        if(node.left!=null) display(node.left);
        if(node.right!=null) display(node.right);
       
    }
    public int query(int i,int j){
        return query(this.root, i,j);
    }
    private int query(TreeNode node, int i, int j) {
      if(node.startInterval>=i && node.endinterval<=j){
        return node.value;
      }else if(node.startInterval>j || node.endinterval<i){
        return 0;
      }else{
        return this.query(node.left,i,j)+this.query(node.right,i,j);
      }
    }
    public void update(int index, int value){
        this.root.value=update(this.root, index,value);
    }
    private int update(TreeNode node,int index,int value){
        if(index>=node.startInterval && index<=node.endinterval){
            if(index==node.startInterval && index==node.endinterval){
                node.value=value;
                return node.value;
            }else{
                int left=update( node.left, index, value);
                int right=update(node.right, index, value);
                node.value=left+right;
                return node.value;
            }
        }
        return node.value;
    }
    public static void main(String[] args) {
        int[] nums={3,8,6,7,-2,-8,4,9};
        SegmentTree tree=new SegmentTree(nums);
        // tree.display();
        int ans=tree.query(2, 6);
        System.out.println(ans);
    }
}
