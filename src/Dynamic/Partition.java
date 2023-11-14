package Dynamic;

import java.util.Arrays;

public class Partition {
    public static void main(String[] args) {
        int[] arr={1,5,11,5};
        int sum=0;
        for(int n:arr) {
            sum+=n;
        }
        int s1=sum/2;
        int s2=sum/2;
        int[][] dp=new int[arr.length][s1+1];
        for(int i=0;i<arr.length;i++) {
            Arrays.fill(dp[i],-1);
        }
        System.out.println(f(arr.length-1,s1,arr,dp));
    }

    static boolean f(int index,int sum,int[] arr,int[][] dp) {
        if(sum==0) return true;
        if(index==0) return arr[0]==sum;

        if(dp[index][sum]!=-1)
            return dp[index][sum]==0?false:true;

        boolean notTake=f(index-1,sum,arr,dp);
        boolean take=false;
        if(sum>=arr[index]) {
            take=f(index-1,sum-arr[index],arr,dp);
            dp[index][sum]= notTake || take?1:0;
        }
        return notTake || take;
    }
}
