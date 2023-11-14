package Dynamic;

import java.util.Arrays;

//'.' Matches any single character.
//        '*' Matches zero or more of the preceding element.
public class WildcardMatching {
    static int f(int i,int j,String s,String p,int[][] dp) {
        if(j<0 && i<0) return 1;
        if(j<0 && i>=0) return 0;
        if(i<0 && j>=0) {
            for(int i1=0;i1<=j;i1++) {
                if(p.charAt(i1)!='*') return 0;
            }
            return 1;
        }


        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='.') {
            return dp[i][j]=f(i-1,j-1,s,p,dp);
        }
        if(p.charAt(j)=='*') {
            return dp[i][j]=f(i-1,j,s,p,dp)==1 || f(i,j-1,s,p,dp)==1 ? 1:0;
        }
        return 0;
    }


    public static void main(String[] args) {
        String s1="aa";
        String s2="a.";
        int i1=s1.length();
        int i2=s2.length();
        int[][] dp=new int[i1+1][i2+1];
        for(int i=0;i<=i1;i++) {
            Arrays.fill(dp[i],-1);
        }
        //System.out.println(f(i1-1,i2-1,s1,s2,dp));
        if(f(i1-1,i2-1,s1,s2,dp)==1) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
