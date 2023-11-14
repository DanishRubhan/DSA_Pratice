package Array;

import java.util.*;

public class Sample {
    public static void main(String[] args) {
        int[][] points= {
                {1,3},
                {-2,2}
        };
        int k=1;

        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)-> (int) ((
                                Math.sqrt(b[0]-a[0])*(b[0]-a[0])) - Math.sqrt(b[1]-a[1])*(b[1]-a[1]))
        ) ;

        for(int[] p:points) {
            pq.add(p);
        }

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }


    }
}
