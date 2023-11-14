package PraticeRough;

import java.util.Arrays;
import java.util.Comparator;

public class Pratice {
    public static void main(String[] args) {
        int[][] boxTypes = {{1,3},{2,2},{3,1}};
        Arrays.sort(boxTypes, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return b[1]-a[1];
            }
        });

        for(int[] n:boxTypes) {
            for(int num:n) {
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
