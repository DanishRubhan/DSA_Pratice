package Graph;

public class wordSearch {
    static boolean dfs(int row,int col,int index,char[][] board,boolean[][] visited,String word) {
        if(index==word.length()) return true;
        if(row<0 || col < 0 || row>=board.length || col>=board[0].length || word.charAt(index)!=board[row][col] || visited[row][col]==true) {
            return false;
        }


        visited[row][col]=true;
        if(dfs(row+1,col,index+1,board,visited,word) || dfs(row,col+1,index+1,board,visited,word) || dfs(row-1,col,index+1,board,visited,word) ||
                dfs(row,col-1,index+1,board,visited,word)) return true;
        visited[row][col]=false;
        return false;
    }
    public static boolean isWordExist(char[][] board, String word)
    {
        // Code here
        boolean[][] visited=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[0].length;j++) {
                if(board[i][j]==word.charAt(0)) {
                    if(dfs(i,j,0,board,visited,word)) return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] baord={
                {'a','g','b','c'},
                {'q','e','e','l'},
                {'g','b','k','s'}
        };
        String word="geeks";
        System.out.println(isWordExist(baord,word));
    }
}
