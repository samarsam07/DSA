import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Bfs {
    public List<Integer> bfsOfGraph(int vertex,List<List<Integer>> adj){
        boolean[] visited=new boolean[vertex];
        Queue<Integer> queue=new LinkedList<>();
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<vertex;i++){
            if(!visited[i]){
                bfs(i, queue, visited, adj, res);
            }
        }

        return res;
    }
    public void bfs(int source,Queue<Integer> queue,boolean[] visited,List<List<Integer>> adj,List<Integer> res){
        visited[source]=true;
        queue.offer(source);
        while (!queue.isEmpty()) {
            int node=queue.poll();
            res.add(node);
            for(int neighbour: adj.get(node)){
                if(!visited[neighbour]){
                    visited[neighbour]=true;
                    queue.offer(neighbour);
                }
            }
        }
    }


}
