package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Input: candidates = [10,1,2,7,6,1,5], target = 8
//        Output:
//        [
//        [1,1,6],
//        [1,2,5],
//        [1,7],
//        [2,6]
//        ]
public class CombinationSum2 {

    public static void main(String[] args) {
        int[] arr={10,1,2,7,6,1,5};
        int target=8;
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        Arrays.sort(arr);
        combine2(0,target,arr,ds,res);
        for(List<Integer> ls:res) {
            System.out.println(ls);
        }
    }

    static void combine2(int index,int target,int[] arr,List<Integer> ds,List<List<Integer>> res) {
        if(target==0) {
            res.add(new ArrayList<>(ds));
            return;
        }

        for(int i=index;i<arr.length;i++) {
            if(i>index && arr[i]==arr[i-1]  ) continue; // current keyword -> end the iteration and do the next iteration
            if(arr[i]>target) break;

            ds.add(arr[i]);
            combine2(i+ 1, target - arr[i], arr, ds, res);
            ds.remove(ds.size()-1);
        }
    }

}
