package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class subsetSumOP {
    public static void main(String[] args) {
        int[] arr={3,1,2};
        List<Integer> ds=new ArrayList<>();
        subsetOP(0,0,arr,ds);
        Collections.sort(ds);
        for(int num:ds) {
            System.out.print(num+" ");
        }

    }

    static void subsetOP(int index,int sum,int[] arr,List<Integer> ds) {
        if(index==arr.length) {
            ds.add(sum);
            return;
        }

        subsetOP(index+1,sum+arr[index],arr,ds);
        subsetOP(index+1,sum,arr,ds);
    }
}
