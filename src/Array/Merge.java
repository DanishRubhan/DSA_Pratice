package Array;
//Input:
//        n = 4, arr1[] = [1 3 5 7]
//        m = 5, arr2[] = [0 2 6 8 9]
//        Output:
//        arr1[] = [0 1 2 3]
//        arr2[] = [5 6 7 8 9]
//        Explanation:
//        After merging the two
//        non-decreasing arrays, we get,
//        0 1 2 3 5 6 7 8 9.

import java.util.Set;
import java.util.TreeSet;

public class Merge {
    static int nextGap(int n) {
        if(n<=1) return 0;
        return (n/2) + (n%2);
    }

    static void merge(int[] arr1,int[] arr2,int n,int m) {
        int i,j,gap=n+m;
        for(gap=nextGap(gap);gap>0;gap=nextGap(gap)) {

            for(i=0;i+gap<n;i++) {
                if(arr1[i]>arr1[i+gap]) {
                    int temp=arr1[i];
                    arr1[i]=arr1[i+gap];
                    arr1[i+gap]=temp;
                }
            }

            //both
            for(j=gap>n?gap-n:0;i<n && j<m;i++,j++) {
                if(arr1[i]>arr2[j]) {
                    int temp=arr1[i];
                    arr1[i]=arr2[j];
                    arr2[j]=temp;
                }
            }

            //arr2
            if(j<m) {
                for (j = 0; j + gap < m; j++)
                    if (arr2[j] > arr2[j + gap])
                    {
                        int temp = arr2[j];
                        arr2[j] = arr2[j + gap];
                        arr2[j + gap] = temp;
                    }
            }


        }

    }

    public static void main(String[] args) {
        int n=2;
        int m=8;
        int[] arr1={1,35};
        int[] arr2={6,9,13,15,20,25,29,46};
        merge(arr1,arr2,n,m);
        for(int n1:arr1) {
            System.out.print(n1+" ");
        }
        Set<Integer> ts=new TreeSet<>();
        for(int n2:arr2) {
            System.out.print(n2+" ");
        }
    }
}
