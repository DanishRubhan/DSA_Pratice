package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PalindromeParitition {
    static void solution(String s,int index,List<String> ls,List<List<String>> res)  {
        if(index==s.length()) {
            res.add(new ArrayList<>(ls));
            return;
        }


        for(int i=index;i<s.length();i++) {
            if(isPalindrom(s,index,i)) {
                ls.add(s.substring(index,i+1));
                solution(s,i+1,ls,res);
                ls.remove(ls.size()-1);
            }
        }

    }

    private static boolean isPalindrom(String s, int start, int end) {
        while (start<=end) {
            if(s.charAt(start++)!=s.charAt(end--)) {
                return  false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s="aabb";
        List<String> str=new ArrayList<>();
        List<List<String>> res=new ArrayList<>();
        solution(s,0,str,res);

        for(List<String> ans:res) {
            for(String row:ans) {
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}
