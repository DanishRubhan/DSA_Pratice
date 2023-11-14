package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class SurroundedRegions {
    static void dfs(int row,int col,char[][] board,int[][] visited) {
//        int[] delRow={-1,0,1,0};
//        int[] delCol={0,1,0,-1};
        if(row<0 || col<0 || row>=board.length || col>=board[0].length || visited[row][col]==1 || board[row][col]=='X') {
            return;
        }
        visited[row][col]=1;
        dfs(row+1,col,board,visited);
        dfs(row-1,col,board,visited);
        dfs(row,col+1,board,visited);
        dfs(row,col-1,board,visited);

    }

    static void solve(char[][] board) {
        int rows=board.length;
        int columns=board[0].length;

        Queue<int[]> q=new LinkedList<>();
        int[][] visited=new int[board.length][board[0].length];

        //traverse first row and last row
        for(int j=0;j<columns;j++) {
            if(board[0][j]=='O' && visited[0][j]==0) {
                dfs(0,j,board,visited);
            }
            if(board[rows-1][j]=='O' && visited[rows-1][j]==0) {
                dfs(rows-1,j,board,visited);
            }
        }

        //traverse first column and last column
        for(int i=0;i<rows;i++) {
            if(board[i][0]=='O' && visited[i][0]==0) {
                dfs(i,0,board,visited);
            }
            if(board[i][columns-1]=='O' && visited[i][columns-1]==0) {
                dfs(i,columns-1,board,visited);
            }
        }

        for(int i=0;i<rows;i++) {
            for(int j=0;j<columns;j++) {
                if(visited[i][j]==0 && board[i][j]=='O') {
                    board[i][j]='X';
                }
            }
        }

    }


    public static void main(String[] args) {
        char[][] board = {
                {'X','X','X','X'},
                {'X','O','O','X'},
                {'X','X','O','X'},
                {'X','O','X','X'}
        };
        solve(board);

        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[0].length;j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }

    }
}
