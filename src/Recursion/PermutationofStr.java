package Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PermutationofStr {
    public static void main(String[] args) {
        int[] arr={1,1,2};
        HashMap<Integer,Integer> hs=new HashMap<>();
        List<Integer> ds=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        permuate(ds,hs,arr,res);
        for(List<Integer> ls:res) {
            System.out.println(ls);
        }
    }

    static void permuate(List<Integer> ds,HashMap<Integer,Integer> hs,int[] arr,List<List<Integer>> res) {
        if(hs.size() == arr.length) {
            res.add(new ArrayList<>(ds));
            return;
        }

        for(int n:arr) {
            if(!hs.containsKey(n)) {
                ds.add(n);
                hs.put(n,1);
                permuate(ds, hs, arr, res);
                ds.remove(ds.size()-1);
                hs.remove(n);
            }
        }

    }


}
