package Recursion;

public class suSequenceString {
    public static void main(String[] args) {
        String s="abc";
        subsequence("",s);
    }

    static void subsequence(String p,String s) {
        if(s.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch=s.charAt(0);
        subsequence(p+ch,s.substring(1));
        subsequence(p,s.substring(1));
    }

}
