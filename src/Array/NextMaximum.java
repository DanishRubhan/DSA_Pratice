package Array;

import java.util.Scanner;

public class NextMaximum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }

        int max=0;
        for(int i=0;i<n;i++) {
            max=Math.max(max,arr[i]);
        }

        for(int i=0;i<n;i++) {
            int a=arr[i];
            int b=max;
            for(int j=0;j<n;j++) {
                if(arr[j]>a && arr[j]<b) {
                    b=arr[j];
                }
            }
            if(a!=b) {
                System.out.println(a+"-->"+b+" , ");
            }else {
                System.out.println(a+"--> , ");
            }
        }

    }
}
