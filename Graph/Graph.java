public class Graph {
    int [][]adjMatrix;
    public Graph(int nodes){
        adjMatrix=new int[nodes][nodes];
    }
    public void addEdges(int [][]edges,boolean isDirected){
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
    public void addEdgesWithWeight(int [][]edgesWithWeight,boolean isDirected){
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
        graph.addEdges(edges, false);
        graph.printGraph();

        System.out.println("Graph with Weight");
        int edgesWithWeight[][]={{0,2,10},{0,1,21},{1,3,5}};
        Graph graph1=new Graph(nodes);
        graph1.addEdgesWithWeight(edgesWithWeight,false);
        graph1.printGraph();
    }
}
