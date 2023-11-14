package Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Permutation2 {
    public static void main(String[] args) {
        int[] arr={1,1,2};
        List<Integer> ds=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        boolean[] used=new boolean[arr.length];
        permutate2(ds,used,arr,res);
        for(List<Integer> ls:res) {
            System.out.println(ls);
        }
    }

    static void permutate2(List<Integer> ds,boolean[] used,int[] arr,List<List<Integer>> res) {
        if(ds.size()==arr.length) {
            res.add(new ArrayList<>(ds));
            return;
        }

        for(int i=0;i<arr.length;i++) {
            if(used[i]) continue;
            if(i>0 && arr[i-1]==arr[i] && !used[i-1]) continue;

            ds.add(arr[i]);
            used[i]=true;
            permutate2(ds,used,arr,res);
            ds.remove(ds.size()-1);
            used[i]=false;
        }

    }
}
