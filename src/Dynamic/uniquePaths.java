package Dynamic;

import java.util.Arrays;

public class uniquePaths {
    public static void main(String[] args) {
        int m=3,n=7;
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++) {
            Arrays.fill(dp[i],-1);
        }
        System.out.println(Solution(dp,m-1,n-1));
    }

    static int Solution(int[][] dp,int m,int n) {
        if(m==0 || n==0) {
            return 1;
        }
        if(dp[m][n]!=-1) return dp[m][n];

        int right=Solution(dp,m-1,n);
        int down=Solution(dp,m,n-1);
        return dp[m][n]=right+down;
    }
 }
