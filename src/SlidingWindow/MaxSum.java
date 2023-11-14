package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxSum {
    static int solution(ArrayList<Integer> arr,int n,int k) {
        int max=0;
        for(int i=0;i<=n-k;i++) {
            int sum=0;
            for(int j=i;j<i+k;j++) {
                sum+=arr.get(j);
            }
            max=Math.max(max,sum);
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(100,200,300,400));
        int N=4;
        int K=2;
        solution(arr,N,K);
    }
}
