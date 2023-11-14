package Recursion;

import java.util.ArrayList;
import java.util.List;

//Input: nums = [1,2,2]
//        Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
public class SubsetII {
    public static void main(String[] args) {
        int[] nums={1,2,2};
        List<Integer> ds=new ArrayList<>();
        List<List<Integer>> outer=new ArrayList<>();
        subCombine(0,ds,nums,outer);
        for(List<Integer> ls:outer) {
            System.out.println(ls);
        }
    }

    static void subCombine(int index,List<Integer> ds,int[] arr,List<List<Integer>> outer) {

        outer.add(new ArrayList<>(ds));

        for(int i=index;i<arr.length;i++) {
            if(i!=index && arr[i]==arr[i-1]) continue;
            ds.add(arr[i]);
            subCombine(i+1,ds,arr,outer);
            ds.remove(ds.size()-1);
        }

    }
}
