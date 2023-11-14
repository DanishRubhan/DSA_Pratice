package Graph;

import java.util.Arrays;

public class Island {
    public static void main(String[] args) {
        char[][] grid={
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };
        int row=grid.length;
        int col= grid[0].length;
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        for(int i=0;i< visited.length;i++) {
            Arrays.fill(visited[i],false);
        }
        int c=0;
        for(int i=0;i< grid.length;i++) {
            for(int j=0;j< grid[0].length;j++) {
                if(grid[i][j]=='1' && visited[i][j]==false) {
                    c++;
                    dfs(i,j,visited,grid);
                }
            }
        }
        for(int i=0;i< visited.length;i++) {
            for(int j=0;j< visited[0].length;j++) {
                System.out.print(visited[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(c);
    }

    static  void dfs(int i,int j,boolean[][] visited,char[][] grid) {
        if(i<0 || i>= grid.length || j<0 || j>=grid[0].length || grid[i][j]=='0' ||visited[i][j]==true) {
            return;
        }

        visited[i][j]=true;
        dfs(i+1,j,visited,grid);
        dfs(i-1,j,visited,grid);
        dfs(i,j+1,visited,grid);
        dfs(i,j-1,visited,grid);
    }
}
