package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagrams {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ls=new ArrayList<>();
        int[] sHash=new int[26];
        int[] pHash=new int[26];

        int window=p.length();
        int len=s.length();

        //if(len<window) return ls;

        int left=0;
        int right=0;
        //first window;
        while(right<window) {
            pHash[p.charAt(right)-'a']++;
            sHash[s.charAt(right)-'a']++;
            right++;
        }
        right=right-1;

        //rest of the window
        while(right<len) {
            if(Arrays.equals(sHash,pHash)) {
                ls.add(left);
            }
            right+=1;
            if(right!=len) sHash[s.charAt(right)-'a']+=1;
            sHash[s.charAt(left)-'a']-=1;
            left+=1;
        }
        return ls;
    }
    public static void main(String[] args) {
        String s="cbaebabacd";
        String p="abc";
        List<Integer> ls=findAnagrams(s,p);
        for(Integer n:ls) {
            System.out.print(n+" ");
        }
    }
}
