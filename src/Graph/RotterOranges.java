package Graph;
//Input: grid = [[2,1,1],[1,1,0],[0,1,1]]
//        Output: 4


import java.util.LinkedList;
import java.util.Queue;

public class RotterOranges {
    public static void main(String[] args) {
        int[][] grid={
                {2,1,1},
                {1,1,0},
                {0,1,1}
        };

        int ans=oranges(grid);
        System.out.println(ans);
    }
    static int oranges(int[][] grid) {

        Queue<int[]> q=new LinkedList<>();
        int freshCount=0;

        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                if(grid[i][j]==2) {
                    q.offer(new int[]{i,j});
                }
                if(grid[i][j]!=0) {
                    freshCount++;
                }
            }
        }
        if(freshCount==0) return 0;

        int days=0;
        int count=0;
        int[] dx={0,0,1,-1};
        int[] dy={1,-1,0,0};

        while(!q.isEmpty()) {
            int size=q.size();
            count+=size;
            for(int i=0;i<size;i++) {
                int[] point=q.poll();
                for(int j=0;j<4;j++) {
                    int x = point[0] + dx[j];
                    int y = point[1] + dy[j];

                    if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == 0 || grid[x][y] == 2)
                        continue;

                    grid[x][y] = 2;
                    q.offer(new int[]{x, y});
                }
            }
            if(q.size()!=0) days++;
        }
        return freshCount==count ?days:-1;


    }
}
