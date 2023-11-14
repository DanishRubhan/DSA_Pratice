package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetSum {
    public static void main(String[] args) {
        int[] arr={2,3};
        List<Integer> ans=subsum(arr);
        for(int n:ans) {
            System.out.print(n+" ");
        }
    }

    static List<Integer> subsum(int[] arr) {
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        List<Integer> ans=new ArrayList<>();
        ans.add(0);
        for(int num:arr) {
            int n=outer.size();
            for(int i=0;i<n;i++) {
                List<Integer> inter=new ArrayList<>(outer.get(i));
                inter.add(num);
                int sum=0;
                for(int s=0;s<inter.size();s++) {
                    sum+=inter.get(s);
                }
                ans.add(sum);
                outer.add(inter);
            }
        }
        return ans;

    }
}
