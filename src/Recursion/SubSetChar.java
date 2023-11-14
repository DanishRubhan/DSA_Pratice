package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetChar {
    public static void main(String[] args) {
        String s="gfg";
        List<List<String>> ans=distinctSubsequences(s);
        System.out.println(ans.size());
        for(List<String> ls:ans) {
            System.out.println(ls);
        }
    }
    static List<List<String>> distinctSubsequences(String S) {
        char[] arr=S.toCharArray();
        Arrays.sort(arr);

        List<List<String>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());

        int start=0;
        int end=0;

        for(int i=0;i<arr.length;i++) {
            start=0;
            if(i>0 && arr[i]==arr[i-1]) {
                start=end+1;
            }
            end=outer.size()-1;
            int n=outer.size();

            for(int j=start;j<n;j++) {
                List<String> inter=new ArrayList<>(outer.get(j));
                inter.add(String.valueOf(arr[i]));
                outer.add(inter);
            }
        }
        return outer;
    }
}
