package backTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllPaths {
    public static void main(String[] args) {
        // allPaths(new int[][]{
        //     {0,0,0},{0,0,0},{0,0,0}
        // }, 0, 0, "", new boolean[][]{
        //     {false,false,false},
        //     {false,false,false},
        //     {false,false,false}
        // });
        // System.out.println(
        //     allPathsReturn(new int[][]{
        //     {0,0,0},{0,0,0},{0,0,0}
        // }, 0, 0, "", new boolean[][]{
        //     {false,false,false},
        //     {false,false,false},
        //     {false,false,false}
        // })
        // );
          System.out.println(
            allPathsReturn(new int[][]{
            {0,0,0},{0,0,0},{0,0,0}
        }, 0, 0, "", new boolean[][]{
            {false,false,false},
            {false,false,false},
            {false,false,false}
        },new int[3][3],1)
        );
    }
    static void allPaths(int[][] maze,int row,int col,String res,boolean[][] visited){
        if(row==maze.length-1 && col==maze[0].length-1){
            System.out.println(res);
            return;
        }
        
        if(visited[row][col]){
            return;
        }
        visited[row][col]=true;
        if(row<maze.length-1){
            
            allPaths(maze, row+1, col, res+"D",visited);
        }
        if(col<maze[0].length-1){
             
            allPaths(maze, row, col+1, res+"R",visited);
        }
        if(row>0){
             
            allPaths(maze, row-1, col, res+"U",visited);
        }
          if(col>0){
             
            allPaths(maze, row, col-1, res+"L",visited);
        }
        visited[row][col]=false;

    }
    static List<String> allPathsReturn(int[][] maze,int row,int col,String res,boolean[][] visited){
        if(row==maze.length-1 && col==maze[0].length-1){
           List<String> ans=new ArrayList<>();
           ans.add(res);
            return ans;
        }
        List<String> ans=new ArrayList<>();
        if(visited[row][col]){
            return ans;
        }
        visited[row][col]=true;
        if(row<maze.length-1){
            
            ans.addAll(allPathsReturn(maze, row+1, col, res+"D",visited));
        }
        if(col<maze[0].length-1){
             
           ans.addAll( allPathsReturn(maze, row, col+1, res+"R",visited));
        }
        if(row>0){
             
            ans.addAll(allPathsReturn(maze, row-1, col, res+"U",visited));
        }
          if(col>0){
             
            ans.addAll(allPathsReturn(maze, row, col-1, res+"L",visited));
        }
        visited[row][col]=false;
        return ans;

    }
    
    
    
    static List<String> allPathsReturn(int[][] maze,int row,int col,String res,boolean[][] visited,int[][] path,int step){
        if(row==maze.length-1 && col==maze[0].length-1){
           List<String> ans=new ArrayList<>();
           ans.add(res);
           for(int[] arr:path){
            System.out.println(Arrays.toString(arr));
           }
           System.out.println(res);
            return ans;
        }
        List<String> ans=new ArrayList<>();
        if(visited[row][col]){
            return ans;
        }
        visited[row][col]=true;
        path[row][col]=step;
        if(row<maze.length-1){
            
            ans.addAll(allPathsReturn(maze, row+1, col, res+"D",visited,path,step+1));
        }
        if(col<maze[0].length-1){
             
           ans.addAll( allPathsReturn(maze, row, col+1, res+"R",visited,path,step+1));
        }
        if(row>0){
             
            ans.addAll(allPathsReturn(maze, row-1, col, res+"U",visited,path,step+1));
        }
          if(col>0){
             
            ans.addAll(allPathsReturn(maze, row, col-1, res+"L",visited,path,step+1));
        }
        visited[row][col]=false;
        path[row][col]=0;
        return ans;

    }
}
