public class NumberOfIsland {
    public int numIslands(char[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int island=0;
        boolean[][] visited=new boolean[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    dfs(i,j,visited,grid);
                    island++;
                }
            }
        }
        return island;
    }
    private void dfs(int i,int j,boolean[][] visited,char[][] grid){
        if(i<0|| i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]=='0' || visited[i][j]){
            return;
        }
        visited[i][j]=true;
        dfs(i-1,j,visited,grid);
        dfs(i,j-1,visited,grid);
        dfs(i+1,j,visited,grid);
        dfs(i,j+1,visited,grid);
    }
}
