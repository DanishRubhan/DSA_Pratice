package String;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String s="bcabc";
        int[] count=new int[26];
        for(int i=0;i<s.length();i++) {
            count[s.charAt(i)-97]+=1;
        }

        for(int i:count) {
            System.out.print(i+" ");
        }

        String ans="";
        for(int i=0;i<26;i++) {
            if(count[i]>=1) {
                ans+=(char) (i+97);
            }
        }
        System.out.println("Ans - "+ans);
    }
}
