package Dynamic;

public class LCSprint {
    static String f(int i1,int i2,String s1,String s2) {
       //tabulation process
        int[][] dp=new int[i1+1][i2+1];

        for(int i=0;i<=i1;i++) {
            dp[i][0]=0;
        }

        for(int i=0;i<=i2;i++) {
            dp[0][i]=0;
        }
        for(int i=1;i<=i1;i++) {
            for(int j=1;j<=i2;j++) {
                if(s1.charAt(i-1)==s2.charAt(j-1)) {
                    dp[i][j]=1+dp[i-1][j-1];
                }else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        System.out.println("Ans index length - "+dp[i1][i2]);
        for(int i=0;i<=i1;i++) {
            for(int j=0;j<=i2;j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        int len=dp[i1][i2];
        int i=i1;
        int j=i2;

        int index = len-1;
        String str="";
        for(int k=1; k<=len;k++){
            str +="$"; // dummy string
        }
        StringBuilder ss= new StringBuilder(s1);
        StringBuilder str2=new StringBuilder(str);
        while(i>0 && j>0){
            if(ss.charAt(i-1) == s2.charAt(j-1)){
                str2.setCharAt(index,ss.charAt(i-1) );
                index--;
                i--;
                j--;
            }
            else if(ss.charAt(i-1)>s2.charAt(j-1)){
                i--;
            }
            else j--;
        }
        return str2.toString();
    }

    public static void main(String[] args) {
        String s1="ace";
        String s2="dae";
        int i1=s1.length();
        int i2=s2.length();
        String p="";
        System.out.println(f(i1,i2,s1,s2));
    }
}
