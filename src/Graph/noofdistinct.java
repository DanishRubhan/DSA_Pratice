package Graph;

import java.util.*;


public class noofdistinct {
    static void dfs(int row, int col, int[][] grid,  boolean[][] visited, ArrayList<String> vec, int br, int bc) {
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || visited[row][col] == true || grid[row][col] == 0) {
            return;
        }
        visited[row][col] = true;
        vec.add(tostring(row-br,col-bc));
        dfs(row + 1, col, grid,  visited, vec, br, bc);
        dfs(row - 1, col, grid,  visited, vec, br, bc);
        dfs(row, col + 1, grid,  visited, vec, br, bc);
        dfs(row, col - 1, grid,  visited, vec, br, bc);

    }

    private static String tostring(int i, int i1) {
        return Integer.toString(i)+" "+Integer.toString(i1);
    }


    static int countDistinctIslands(int[][] grid) {
        // Your Code here
        int rows = grid.length;
        int columns = grid[0].length;
        boolean[][] visited = new boolean[rows][columns];
        HashSet<ArrayList<String>> s = new HashSet<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (grid[i][j] == 1 && visited[i][j] == false) {
                    ArrayList<String> vec=new ArrayList<>();
                    dfs(i, j, grid, visited,vec,i,j);
                    s.add(vec);
                }
            }
        }
        return s.size();
    }

    public static void main(String[] args) {
        int[][] grid = {
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 0, 1, 1},
                {0, 0, 0, 1, 1}
        };

        int[][] graph = {
                {1,2,3},
                {0,2},
                {0,1,3},
                {0,2}
        };
        for(int n:graph[2]) {
            System.out.print(n+" ");
        }

        //System.out.println("Ans=" + countDistinctIslands(grid));

    }
}