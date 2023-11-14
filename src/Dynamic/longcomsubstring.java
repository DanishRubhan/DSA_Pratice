package Dynamic;

public class longcomsubstring {
    public static void main(String[] args) {
        String s1="ABCDGH";
        String s2="ACDGHR";
        int i1=s1.length();
        int i2=s2.length();
        int[][] dp=new int[i1+1][i2+1];
        for(int i=0;i<=i1;i++) {
            dp[i][0]=0;
        }

        for(int j=0;j<=i2;j++)
        {
            dp[0][j]=0;
        }

        for(int i=1;i<=i1;i++) {
            for(int j=1;j<=i2;j++) {
                if(s1.charAt(i-1)==s2.charAt(j-1)) {
                    if(dp[i-1][j-1]!=0) dp[i][j]=1+dp[i-1][j-1];
                    else {
                        dp[i][j] = 1;
                    }
                }
            }
        }

        for(int i=0;i<=i1;i++) {
            for(int j=0;j<=i2;j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }

        int max=Integer.MIN_VALUE;
        for(int i=0;i<=i1;i++) {
            for(int j=0;j<=i2;j++) {
                max=Math.max(max,dp[i][j]);
            }
        }

        System.out.println("Ans  = " + max);
    }
}
