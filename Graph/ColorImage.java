public class ColorImage {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int row=image.length;
        int col=image[0].length;
        boolean[][] visited=new boolean[row][col];
        if(!visited[sr][sc]){
            dfs(image,sr,sc,visited,color,image[sr][sc]);
        }
        return image;
    }
    private void dfs(int[][] image ,int i,int j,boolean[][] visited,int color,int curColor){
        if(i>=image.length || j>=image[0].length || i<0 || j<0 || image[i][j]!=curColor|| visited[i][j]){
            return ;
        }
        visited[i][j]=true;
        image[i][j]=color;
        dfs(image,i-1,j,visited,color,curColor);
        dfs(image,i,j-1,visited,color,curColor);
        dfs(image,i+1,j,visited,color,curColor);
        dfs(image,i,j+1,visited,color,curColor);

    }
}
