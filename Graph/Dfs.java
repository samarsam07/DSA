import java.util.ArrayList;
import java.util.List;

public class Dfs{
    public List<Integer> dfsOfGraph(int vertex,List<List<Integer>> adj){
        List<Integer> res=new ArrayList<>();
        boolean[] visited=new boolean[vertex];
        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                dfs(i,visited,adj,res);
            }
        }
        return res;
    }
    public void dfs(int node,boolean[] visited,List<List<Integer>> adj,List<Integer> res){
        visited[node]=true;
        res.add(node);
        for(int neighbour:adj.get(node)){
            if(!visited[neighbour]){
                dfs(neighbour, visited, adj, res);
            }
        }
    }
    public static void main(String[] args) {
        Dfs dfs=new Dfs();
        Graph graph2=new Graph(4);
        int edges[][]={{0,2},{0,1},{1,3}};
        graph2.addEdgesInList(edges, false);
        List<Integer> res= dfs.dfsOfGraph(4,graph2.adjList);
        System.out.println(res.toString());
    }
}