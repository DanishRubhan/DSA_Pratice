package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Points {
    public static void main(String[] args) {
        int[][] points={
                {1,1},
                {3,2},
                {5,3},
                {4,1},
                {2,3}
        };

        int row= points.length;
        int col=points[0].length;
        boolean[] visited=new boolean[row];

        int max=0;
        Arrays.fill(visited,false);
       int[][] adj=new int[row+5][col+5];
        for(int[] rows:points) {
            for(int nn:rows) {
                adj[nn][nn]=1;
            }
        }

        for(int[] ed:points) {
            adj[ed[0]][ed[1]]=1;
            adj[ed[1]][ed[0]]=1;
        }

        for(int[] rows:adj) {
            for(int nn:rows) {
                System.out.print(nn+" ");
            }
            System.out.println();
        }

    }
}
