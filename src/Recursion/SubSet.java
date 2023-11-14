package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int[] arr={1,2,2};
        List<List<Integer>> res=subsetDuplicates(arr);

        for(List<Integer> row:res) {
            System.out.println(row);
        }
    }

    static int subset(int[] arr) {
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num:arr) {
            int n=outer.size();
            for(int i=0;i<n;i++) {
                List<Integer> inter=new ArrayList<>(outer.get(i));
                inter.add(num);
                
                outer.add(inter);
            }
        }
        return outer.size();
    }

    static List<List<Integer>> subsetDuplicates(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0;
        int end=0;

        for(int i=0;i<arr.length;i++) {
            start=0;
            if(i>0 && arr[i] == arr[i-1]) {
                start=end+1;
            }
            end=outer.size()-1;
            int n=outer.size();
            for(int j=start;j<n;j++) {
                List<Integer> inter=new ArrayList<>(outer.get(j));
                inter.add(arr[i]);
                outer.add(inter);
            }
        }
        return outer;
    }
}
