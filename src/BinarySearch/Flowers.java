package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Flowers {
    public static void main(String[] args) {
        int[][] flowers = {
                {1, 6},
                {3, 7},
                {4, 13},
                {9, 13}
        };

        int n=flowers.length;
        int[] people={2,3,7,11};
        int[] result = new int[people.length];

        // Sort the flowers array based on start time
        Arrays.sort(flowers, (a, b) -> a[0] - b[0]);

        // For each person, find the index of the flower that blooms just before their arrival time
        for (int i = 0; i < people.length; i++) {
            int arrivalTime = people[i];

            int left = 0, right = n - 1, index = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (flowers[mid][0] <= arrivalTime) {
                    index = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            // Count the number of flowers in full bloom at the found index
            int count = 0;
            for (int j = 0; j <= index; j++) {
                if (flowers[j][1] >= arrivalTime) {
                    count++;
                }
            }
            result[i] = count;
        }

        for(int r:result) {
            System.out.print(r+" ");
        }

        int[] arr={1,2,3,4};
        String num="1234";
        int sdsa=Integer.valueOf(num);

    }
}
