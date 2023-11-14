package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr={2,3,6,7};
        List<Integer> ds=new ArrayList<>();
        List<List<Integer>> res= new ArrayList<>();
        combine(0,7,arr,ds,res);
        for(List<Integer> ls:res) {
            System.out.println(ls);
        }
    }

    static void combine(int index,int target,int[] arr,List<Integer> ds,List<List<Integer>> res) {
            if(index==arr.length) {
                if(target==0) {
                    res.add(new ArrayList<>(ds));
                }
                return;
            }


            if(arr[index]<=target) {
                ds.add(arr[index]);
                combine(index, target - arr[index], arr, ds, res);
                ds.remove(ds.size()-1);
            }
            combine(index+1,target,arr,ds,res);
    }
}
