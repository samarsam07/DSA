import java.util.*;

public class VerticalTraverse {
    public List<List<Integer>> VerticalTraverse(TreeNode root){
        List<List<Integer>> ans =new ArrayList<>();
        if(root==null)return ans;
        int col=0;
        Queue<Map.Entry<TreeNode,Integer>> queue=new ArrayDeque<>();
        Map<Integer,List<Integer>> map=new HashMap<>();
        queue.offer(new AbstractMap.SimpleEntry<>(root,col));
        int min=0;
        int max=0;
        while(!queue.isEmpty()){
            Map.Entry<TreeNode,Integer> removed=queue.poll();
            root=removed.getKey();
            col=removed.getValue();
            if(root!=null){
                if(!map.containsKey(col)){
                    map.put(col, new ArrayList<>());
                }
                map.get(col).add(root.val);
                min=Math.min(min, col);
                max=Math.max(col, max);
                queue.offer(new AbstractMap.SimpleEntry<>(root.left,col-1));
                queue.offer(new AbstractMap.SimpleEntry<>(root.right,col+1));
            }
        }
        for(int i=min;i<=max;i++){
            ans.add(map.get(i));
        }

        return ans;
    }
}
