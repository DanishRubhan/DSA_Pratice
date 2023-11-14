package Recursion;

public class Fibo {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<=5;i++) {
            System.out.print(fibo(i)+" ");
        }
    }

    static int fibo(int n) {
        if(n==0 || n==1) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
