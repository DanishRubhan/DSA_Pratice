package Dynamic;

import java.util.Arrays;

public class knapsack {
    static int f(int index,int W,int[] wt,int[] val,int[][] dp) {
        if(index==0) {
            if(wt[index]<=W) {
                return val[index];
            }else {
                return 0;
            }
        }
        if(dp[index][W]!=-1) return dp[index][W];

        int notPick=0+f(index-1,W,wt,val,dp);
        int pick=Integer.MAX_VALUE;
        if(wt[index]<=W) {
            pick=val[index]+f(index-1,W-wt[index],wt,val,dp);
        }
        return dp[index][W]=Math.max(notPick,pick);
    }

    public static void main(String[] args) {
        int[] wt={3,2,5};
        int[] val={30,40,60};
        int W=6;
        int n=wt.length;
        int[][] dp=new int[wt.length][W+1];
        for(int i=0;i<wt.length;i++) {
            Arrays.fill(dp[i],-1);
        }
        System.out.println(f(n-1,W,wt,val,dp));
    }
}
