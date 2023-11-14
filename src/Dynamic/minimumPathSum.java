package Dynamic;

import java.util.Arrays;

public class minimumPathSum {
    public static void main(String[] args) {
        int[][] grid={
                {1,3,1},
                {1,5,1},
                {4,2,1}
        };
        int row= grid.length;
        int col= grid[0].length;
        int[][] dp=new int[row][col];
        for(int i=0;i<row;i++) {
            Arrays.fill(dp[i],-1);
        }
        System.out.println(solution(row-1,col-1,grid,dp));
    }

    static int solution(int i,int j,int[][] grid,int[][] dp) {
        if(i==0 && j==0) {
            return grid[i][j];
        }

        if(i<0 || j<0) {
            return (int)Math.pow(10,9);
        }
        if(dp[i][j]!=-1) {
            return dp[i][j];
        }
        int up=grid[i][j]+solution(i-1,j,grid,dp);
        int left=grid[i][j]+solution(i,j-1,grid,dp);

        return dp[i][j]=Math.min(up,left);
    }
}
