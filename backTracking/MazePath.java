package backTracking;

import java.util.ArrayList;
import java.util.List;

public class MazePath {
    public static void main(String[] args) {
    //   System.out.println(mazePathsReturn(1,1,3,3,""));
    // mazeWithObstacles(new int[][]{{0,0,0},{0,1,0},{0,0,0}},0,0,"");
    System.out.println(mazeWithObstaclesReturn(new int[][]{{0,0,0},{0,1,0},{0,0,0},{1,0,0}},0,0,""));
    }
    static void mazePaths(int row,int col,int endRow,int endCol,String res){
        if(row==endRow && col==endCol){
            System.out.println(res);
        }
        if(row<endRow){
            mazePaths(row+1, col, endRow, endCol, res+"D");
        }
        if(col<endCol){
            mazePaths(row, col+1, endRow, endCol, res+"R");
        }
    }
    static List<String> mazePathsReturn(int row,int col,int endRow,int endCol,String res){
        if(row==endRow && col==endCol){
            List<String> ans=new ArrayList<>();
            ans.add(res);
            return ans;
        }
        List<String> ans=new ArrayList<>();
        if(row<endRow){
           ans.addAll( mazePathsReturn(row+1, col, endRow, endCol, res+"D"));
        }
        if(col<endCol){
           ans.addAll( mazePathsReturn(row, col+1, endRow, endCol, res+"R"));
        }
        return ans;
    }
    static void mazeWithObstacles(int[][] maze,int row,int col,String res){
        if(row==maze.length -1&& col==maze[0].length-1){
            System.out.println(res);
            return;
        }
        if(row<maze.length-1){
            if(maze[row][col]==1){

                return;
            }else{
                mazeWithObstacles(maze, row+1, col, res+"D");
            }
        }
         if(col<maze[0].length-1){
            if(maze[row][col]==1){
                return;
            }else{
                mazeWithObstacles(maze, row, col+1, res+"R");
            }
        }
    }
    static List<String> mazeWithObstaclesReturn(int[][] maze,int row,int col,String res){
        if(row==maze.length -1&& col==maze[0].length-1){
            List<String> ans=new ArrayList<>();
            ans.add(res);
            return ans;
        }
        List<String> ans=new ArrayList<>();
        if(row<maze.length-1){
            if(maze[row][col]!=1){
                ans.addAll(mazeWithObstaclesReturn(maze,row+1,col,res+"D"));
            }
        }
         if(col<maze[0].length-1){
            if(maze[row][col]!=1){
                 ans.addAll(mazeWithObstaclesReturn(maze,row,col+1,res+"R"));
            }
        }
        return ans;
    }
}
