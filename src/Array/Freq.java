package Array;

import java.util.HashMap;

public class Freq {
    static void solution(int[] arr,int N,int P) {
        int i=0;
        while(i<N) {
            if (arr[i] <= 0) {
                i++;
                continue;
            }
            int e = arr[i] - 1;
            if(e<N) {
                if (arr[e] <= 0) {
                    arr[e]--;
                    arr[i] = 0;
                    i++;
                } else {
                    arr[i] = arr[e];
                    arr[e] = -1;
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {
            arr[k] = Math.abs(arr[k]%N);
        }
    }


    public static void main(String[] args) {
        int[] arr={2,4,5,6,8};
        int N=5;
        int P=10;
        //solution(arr,N,P);

//        for(int i=0;i<arr.length;i++) {
//            System.out.print(arr[i]+" ");
//        }
        System.out.println("Hello");
        System.out.println(12/0);
    }
}
