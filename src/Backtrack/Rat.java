package Backtrack;

import java.util.ArrayList;
import java.util.List;

public class Rat {
    static void f(int startRow,int startCol,int endRow,int endCol,String dir,List<String> ls,int[][] m) {
        if(startCol<0 || startCol <0 || startRow>=m.length || startCol>=m[0].length || m[startRow][startCol]==0) return;
        if(startRow==endRow && startCol==endCol) {
            ls.add(dir);
            return;
        }
        //use visited
        f(startRow+1,startCol,endRow,endCol,dir+"D",ls,m);
        f(startRow-1,startCol,endRow,endCol,dir+"U",ls,m);
        f(startRow,startCol-1,endRow,endCol,dir+"L",ls,m);
        f(startRow,startCol+1,endRow,endCol,dir+"R",ls,m);
    }


    public static void main(String[] args) {
        int n=4;
        int m[][] = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };
        List<String> ls=new ArrayList<>();
        f(0,0,n-1,n-1,"",ls,m);
        for(String s:ls) {
            System.out.println(s);
        }
    }
}
