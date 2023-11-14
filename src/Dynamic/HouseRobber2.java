package Dynamic;

import java.util.Arrays;
import java.util.Collections;

public class HouseRobber2 {
    public static void main(String[] args) {
        int[] arr={2,3,2};
        //int min = Arrays.stream(tab).min().getAsInt();
        int[] temp1=new int[arr.length-1];
        int[] tenp2=new int[arr.length-1];
        int k=0,l=0;
        for(int i=0;i<arr.length;i++) {
            if(i!=0) temp1[k++]=arr[i];
            if(i!=arr.length-1) tenp2[l++]=arr[i];
        }
        for(int n:temp1) {
            System.out.print(n+" ");
        }
        System.out.println();
        for(int n:tenp2) {
            System.out.print(n+" ");
        }
        System.out.println();
        System.out.println("Ans 1 = " + houseRobbber(temp1,temp1.length-1));
        System.out.println("Ans 2 = "+ houseRobbber(tenp2,tenp2.length-1));
        int ans=Math.max(houseRobbber(temp1,temp1.length-1), houseRobbber(tenp2,tenp2.length-1));
        System.out.println(ans);
    }

    static int houseRobbber(int[] arr,int index) {
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
        return dp[index];
    }
}
