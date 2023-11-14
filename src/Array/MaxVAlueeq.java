package Array;

import java.util.PriorityQueue;

public class MaxVAlueeq {
    public static void main(String[] args) {
        int[][] points={
                {1,3},
                {2,0},
                {5,10}
        };
        int k=1;
        PriorityQueue<int[]> ps=new PriorityQueue<>((a,b)->(b[1]-b[0])-(a[1]-a[0]));


    }
}
