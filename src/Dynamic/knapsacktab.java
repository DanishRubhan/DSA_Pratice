package Dynamic;

public class knapsacktab {
    static int f(int index,int W,int[] wt,int[] val) {
        int[][] dp=new int[index][W+1];
        for(int i=wt[0];i<=W;i++) {
            dp[0][i]=val[0];
        }
        for(int i=1;i<index;i++) {
            for(int j=0;j<=W;j++) {
                int notPick=0+dp[i-1][j];
                int pick=Integer.MIN_VALUE;
                if(wt[i]<=j) {
                    pick=val[i]+dp[i-1][j-wt[i]];
                }
                dp[i][j]=Math.max(notPick,pick);
            }
        }
        return dp[index-1][W-1];
    }

    public static void main(String[] args) {
        int[] wt={3,2,5};
        int[] val={30,40,60};
        int W=6;
        System.out.println(f(wt.length-1,W,wt,val));
    }
}
