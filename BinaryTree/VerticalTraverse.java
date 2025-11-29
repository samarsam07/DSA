import java.util.*;


public class VerticalTraverse {
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
    class LevelNode{
        private TreeNode node;
        private int lvl;
        public LevelNode(TreeNode node,int lvl){
            this.node=node;
            this.lvl=lvl;
        }
        public TreeNode getNode(){
            return node;
        }
        public int getLvl(){
            return lvl;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root){
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)return ans;

        int col=0;
        Queue<LevelNode> q=new LinkedList<>();
        LevelNode start=new LevelNode(root, col);
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        q.add(start);
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        while(!q.isEmpty()){
            LevelNode curr=q.poll();
            if(!map.containsKey(curr.getLvl())){
                map.put(curr.getLvl(), new ArrayList<>());
            }
            map.get(curr.getLvl()).add(curr.getNode().val);
            min=Math.min(min,curr.getLvl());
            max=Math.max(max, curr.getLvl());
            if(curr.getNode().left!=null){
                q.add(new LevelNode(curr.getNode().left, curr.getLvl()-1));
            }
             if(curr.getNode().right!=null){
                q.add(new LevelNode(curr.getNode().right, curr.getLvl()+1));
            }
        }
        for(int i=min;i<=max;i++){
            ans.add(map.get(i));
        }
        return ans;
    }
}
