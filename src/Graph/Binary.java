package Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Pair {
    int steps;
    int row;
    int col;
    Pair(int steps, int row, int col) {
        this.steps = steps;
        this.row = row;
        this.col = col;
    }
}

public class Binary {


     static int shortestPathBinaryMatrix(int[][] grid) {
            Queue<Pair> q = new LinkedList<>();
            q.offer(new Pair(0, 0, 0));
            int[][] dist = new int[grid.length][grid[0].length];
            for (int[] d : dist) {
                Arrays.fill(d, (int) 1e9);
            }
            dist[0][0] = 0;
            int[] dirX = {-1, 0, 1, 0, 1, 1, -1, -1};
            int[] dirY = {0, 1, 0, -1, 1, -1, 1, -1};

            while (!q.isEmpty()) {
                int steps = q.peek().steps;
                int r = q.peek().row;
                int c = q.peek().col;
                q.poll();

                for (int i = 0; i < 8; i++) {
                    int newRow = r + dirX[i];
                    int newCol = c + dirY[i];
                    if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length
                            && 1 + steps < dist[newRow][newCol] && grid[newRow][newCol] == 0) {
                        dist[newRow][newCol] = steps + 1;
                        if (newRow == grid.length - 1 && newCol == grid[0].length - 1) return steps + 1;
                        q.offer(new Pair(steps + 1, newRow, newCol));
                    }
                }
            }
            return -1;
        }

    public static void main(String[] args) {
        int[][] grid={
                {0,1},
                {1,0}
        };
        int ans=shortestPathBinaryMatrix(grid);
        System.out.println(ans);
    }


    }
