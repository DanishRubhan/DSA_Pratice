package Dynamic;

import java.util.Arrays;

public class nodAdjacentPract {
    public static void main(String[] args) {
        int[] arr={2,1,4,9};
        int[] dp=new int[arr.length];
        Arrays.fill(dp,-1);
        System.out.println(solution(arr.length-1,arr,dp));
    }

    static int solution(int index,int[] arr,int[] dp) {
         if(index==0) return arr[0];
         if(index<0) return 0;

         if(dp[index]!=-1) return dp[index];
        int pick=arr[index]+solution(index-2,arr,dp);
        int notPick=0+solution(index-1,arr,dp);

        return dp[index]=Math.max(pick,notPick);
    }
}
