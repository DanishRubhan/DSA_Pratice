package Array;

public class NextGreaterElementIII {
    static int solution(int n) {
        String str=String.valueOf(n);
        StringBuilder sb=new StringBuilder(str);
        String s=sb.reverse().toString();
        int num=Integer.valueOf(s);
        if(num>n) return num;
        return -1;
    }
    public static void main(String[] args) {
        int n=12;
        System.out.println(solution(n));
    }
}
