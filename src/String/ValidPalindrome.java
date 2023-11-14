package String;
//Input: s = "A man, a plan, a canal: Panama"
//        Output: true
//        Explanation: "amanaplanacanalpanama" is a palindrome.

import java.util.HashMap;
import java.util.Locale;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama ";
        String str=s.toLowerCase().replaceAll("[^a-z0-9]","");
        System.out.println(str);
        System.out.println(str.length());
        HashMap<Integer,Integer> hs;

    }
}
