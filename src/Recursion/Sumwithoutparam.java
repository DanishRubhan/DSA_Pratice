package Recursion;

public class Sumwithoutparam {
    public static void main(String[] args) {
        int n=4;
        int ans=fun(n);
        System.out.println(ans);
    }

    static int fun(int n){
        if(n==0) {
            return 0;
        }
        return n+fun(n-1);
    }
}
