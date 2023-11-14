package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    static List<List<String>> solution(String[] strs) {
        HashMap<String,List> hs=new HashMap<>();
        for(String s:strs) {
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String ss=String.valueOf(arr);
            if(!hs.containsKey(ss)) {
                hs.put(ss,new ArrayList());
            }
            hs.get(ss).add(s);
        }
        return new ArrayList(hs.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ls=solution(strs);
        for(List<String> o:ls) {
            for(String s:o) {
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
}
