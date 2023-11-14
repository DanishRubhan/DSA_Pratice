package Backtrack;

public class NQueen {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];
        int c=countQueen(board,0);
    }


    static int countQueen(boolean[][] board,int row) {
        if(row==board.length) {
            display(board);
            return 1;
        }
        int c=0;

        for(int col=0;col<board.length;col++) {
            if(isSafe(board,row,col)){
                board[row][col]=true;
                c+=countQueen(board,row+1);
                board[row][col]=false;
            }
        }
        return  c;
    }

    static boolean isSafe(boolean[][] board,int row,int col) {
        //vertival
        for(int i=0;i<board.length;i++) {
            if(board[i][col]) {
                return false;
            }
        }

        //left diagonal
        int maxLeft=Math.min(row,col);
        for(int i=0;i<=maxLeft;i++) {
            if(board[row-i][col-i]) {
                return false;
            }
        }

        //right diagonal
        int maxRight=Math.min(row,board.length-col-1);
        for(int i=0;i<=maxRight;i++) {
            if(board[row-i][col+i]) {
                return false;
            }
        }

        return true;
    }

    static  void display(boolean[][] board) {
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[0].length;j++) {
                if(board[i][j]==true) {
                    System.out.print("Q ");
                }else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
