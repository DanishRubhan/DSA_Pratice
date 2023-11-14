package Dynamic;

import java.util.Arrays;

public class nonadjacent {


    public static void main(String[] args) {
        int[] arr={2,1,3,9};
        System.out.println(fun(arr.length-1,arr));
    }

    static int fun(int index,int[] arr) {
        int[] dp=new int[index+1];
        dp[0]=arr[0];
        for(int i=1;i<=index;i++) {
            int take=arr[i];
            if(i>1) {
                take+=dp[i-2];
            }
            int notTake=0+dp[i-1];
            dp[i]=Math.max(take,notTake);
        }
        for(int n:dp) {
            System.out.print(n+" ");
        }
        System.out.println();
        return dp[index];

    }
}
