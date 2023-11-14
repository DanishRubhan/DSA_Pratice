package Recursion;

public class SumOfFirstN {
    public static void main(String[] args) {
        int n=5;
        sum(n,0);
    }
    static void sum(int n,int res) {
        if(n<1) {
            System.out.println(res);
            return;
        }
       sum(n-1,res+n);
    }

}
