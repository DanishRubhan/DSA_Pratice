package Dynamic;

public class Pract {
    static int lcs(int i1,int i2,String s1,String s2) {
        int[][] dp=new int[i1+1][i2+1];
        for(int i=0;i<=i1;i++) {
            dp[i][0]=0;
        }
        for(int j=0;j<=i2;j++) {
            dp[0][j]=0;
        }

        for(int i=1;i<=i1;i++) {
            for(int j=1;j<=i2;j++) {
                if(s1.charAt(i-1)==s2.charAt(j-1)) {
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[i1][i2];

    }


    public static int minDistance(String word1, String word2) {
        //deletion = n-lcs(s1);
        //insertion = m - lcs(s2);
        // n+m - 2*lcs(s)
        int n=word1.length();
        int m=word2.length();

        return n+m-(2*lcs(n,m,word1,word2));
    }

    public static void main(String[] args) {
        System.out.println(minDistance("sea","eat"));
    }
}
