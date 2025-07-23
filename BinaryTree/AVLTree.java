import org.w3c.dom.Node;

public class AVLTree {
    public static void main(String[] args) {
        
    }
    static class TreeNode{
    private int value;
    private TreeNode left;
    private TreeNode right;
    private int height;
    TreeNode(int x){
        value = x;

    }
    public int getValue() {
      return value;
    }
  }

  private TreeNode root;

  public AVLTree() {

  }

  public int height() {
    return height(root);
  }
  private int height(TreeNode node) {
    if (node == null) {
      return -1;
    }
    return node.height;
  }
  
  public void insert(int value) {
    root = insert(value, root);
  }

  private TreeNode insert(int value, TreeNode node) {
    if (node == null) {
      node = new TreeNode(value);
      return node;
    }

    if (value < node.value) {
      node.left = insert(value, node.left);
    }

    if (value > node.value) {
      node.right = insert(value, node.right);
    }

    node.height = Math.max(height(node.left), height(node.right)) + 1;
    return rotate(node);
  }

  private TreeNode rotate(TreeNode node) {
   if(height(node.left)-height(node.right)>1){
        // left heavy
        if(height(node.left.left)-height(node.left.right)>0){
            // left left case
            return rightRotate(node);
        }
        if(height(node.left.left)-height(node.left.right)<0){
            // left right case
            node.left=leftRotate(node.left);
            return rightRotate(node);
        }
   }
    if(height(node.left)-height(node.right)<-1){
        // left heavy
        if(height(node.right.left)-height(node.right.right)<0){
            // right right case
            return leftRotate(node);
        }
        if(height(node.right.left)-height(node.right.right)>0){
            // left right case
            node.right=rightRotate(node.right);
            return leftRotate(node);
        }
   }
   return node;
  }
  public TreeNode leftRotate(TreeNode node){
    TreeNode child=node.right;
    TreeNode t=child.left;
    child.left=node;
    node.right=t;

    node.height=Math.max(height(node.left), height(node.right))+1;
    child.height=Math.max(height(child.left), height(child.right))+1;
    return child;
  }
  public TreeNode rightRotate(TreeNode node){
    TreeNode child=node.left;
    TreeNode t=child.right;
    child.right=node;
    node.left=t;

    node.height=Math.max(height(node.left), height(node.right))+1;
    child.height=Math.max(height(child.left), height(child.right))+1;
    return child;

  }
  public void populate(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      this.insert(nums[i]);
    }
  }

  public void populatedSorted(int[] nums) {
    populatedSorted(nums, 0, nums.length);
  }

  private void populatedSorted(int[] nums, int start, int end) {
    if (start >= end) {
      return;
    }

    int mid = (start + end) / 2;

    this.insert(nums[mid]);
    populatedSorted(nums, start, mid);
    populatedSorted(nums, mid + 1, end);
  }

  public void display() {
    display(this.root, "Root Node: ");
  }

  private void display(TreeNode node, String details) {
    if (node == null) {
      return;
    }
    System.out.println(details + node.value);
    display(node.left, "Left child of " + node.value + " : ");
    display(node.right, "Right child of " + node.value + " : ");
  }

  public boolean isEmpty() {
    return root == null;
  }

  public boolean balanced() {
    return balanced(root);
  }

  private boolean balanced(TreeNode node) {
    if (node == null) {
      return true;
    }
    return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
  }
}

