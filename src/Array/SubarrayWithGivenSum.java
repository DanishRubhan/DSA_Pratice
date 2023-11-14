package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//        Input:
//          N = 5, S = 12
//          A[] = {1,2,3,7,5}
//        Output: 2 4
//          Explanation: The sum of elements
//        from 2nd position to 4th position
//        is 12.
public class SubarrayWithGivenSum {
    static ArrayList<Integer> Solution(int[] arr,int N,int S) {
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<N;i++) {
            for(int j=i+1;j<N;j++) {
                int sum=0;
                for(int start=i;start<=j;start++) {
                    sum+=arr[start];
                }
                if(sum==S) {
                    res.add(i+1);
                    res.add(j+1);
                    return  res;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] A={1,2,3,7,5};

        int N=5;
        int S=12;
//        ArrayList<Integer> res=Solution2(A,N,S);
//        for(Integer nn:res) {
//            System.out.print(nn+" ");
//        }
    }

    static ArrayList<Integer> Solution2(int[] arr,int N,int S) {
        ArrayList<Integer> res=new ArrayList<>();

        int left=0;
        int right=0;
        int sum=0;
        sum+=arr[left];
        while(left<=right) {
            if(sum<S) {
                right++;
                sum+=arr[right];
            }
            else if(sum>S) {
                sum-=arr[left];
                left++;
            }else if(sum==S) {
                res.add(left+1);
                res.add(right+1);
                return res;
            }
        }

        return new ArrayList<>(Arrays.asList(-1,-1));
    }
}
