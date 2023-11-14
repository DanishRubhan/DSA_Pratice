package Recursion;

public class palindrome {
    public static void main(String[] args) {
        String s="madam";
        boolean ans=pal(0,s.length()-1,s);
        System.out.println(ans);
    }
    static boolean pal(int s,int e,String S) {
        if(s>=e) {
            if (S.charAt(s) != S.charAt(e)) {
                return false;
            }
            pal(s+1,e-1,S);
        }
        return true;
    }

}
