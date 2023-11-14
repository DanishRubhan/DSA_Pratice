package Dynamic;

public class LCS {
    static int f(int index1,int index2,String s1,String s2) {
        if(index1<0 || index2<0) {
            return 0;
        }

        if(s1.charAt(index1)==s2.charAt(index2)) {
            return 1+f(index1-1,index2-1,s1,s2);
        }
        return Math.max(f(index1-1,index2,s1,s2),f(index1,index2-1,s1,s2));
    }


    public static void main(String[] args) {
        String s1="adcde";
        String s2="ace";
        System.out.println(f(s1.length()-1,s2.length()-1,s1,s2));
    }
}
