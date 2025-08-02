import java.util.ArrayList;
import java.util.List;

public class Graph {
    int [][]adjMatrix;
    List<List<Integer>> adjList;
    public Graph(int nodes){
        adjMatrix=new int[nodes][nodes];
        adjList=new ArrayList<>();
        for(int i=0;i<nodes;i++){
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdgesInMatrix(int [][]edges,boolean isDirected){
        for(int []edge:edges){
            int u=edge[0];
            int v=edge[1];

            // Directed
            if(isDirected){
                adjMatrix[u][v]=1;
            }else{
                // Undirected
                adjMatrix[u][v]=1;
                adjMatrix[v][u]=1;
            }

        }
    }
    public void addEdgesInList(int [][]edges,boolean isDirected){
        for(int []edge:edges){
            int u=edge[0];
            int v=edge[1];

            // Directed
            if(isDirected){
                adjList.get(u).add(v);
            }else{
                // Undirected
               adjList.get(u).add(v);
               adjList.get(v).add(u);
            }

        }
    }
    public void addEdgesWithWeightInMatrix(int [][]edgesWithWeight,boolean isDirected){
        for(int []edge:edgesWithWeight){
            int u=edge[0];
            int v=edge[1];
            int weight=edge[2];
             // Directed
            if(isDirected){
                adjMatrix[u][v]=weight;
            }else{
                // Undirected
                adjMatrix[u][v]=weight;
                adjMatrix[v][u]=weight;
            }
            
        }
    }
    public void printList(){
        for(List<Integer> list:adjList){
            System.out.println(list.toString());
        }
    }
    public void printGraph(){
        for(int i=0;i<adjMatrix.length;i++){
            System.out.print("row "+i +"-> ");
            for(int j=0;j<adjMatrix[i].length;j++){
                System.out.print(adjMatrix[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int edges[][]={{0,2},{0,1},{1,3}};
        int nodes=4;
        Graph graph=new Graph(nodes);
        graph.addEdgesInMatrix(edges, false);
        graph.printGraph();

        System.out.println("Graph with Weight");
        int edgesWithWeight[][]={{0,2,10},{0,1,21},{1,3,5}};
        Graph graph1=new Graph(nodes);
        graph1.addEdgesWithWeightInMatrix(edgesWithWeight,false);
        graph1.printGraph();

        System.out.println("List representation");
        Graph graph2=new Graph(nodes);
        graph2.addEdgesInList(edges, false);
        graph2.printList();
        Bfs bfs=new Bfs();
        List<Integer> res=bfs.bfsOfGraph(nodes, graph2.adjList);
        System.out.println(res.toString());
        
    }
}
