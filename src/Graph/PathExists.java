package Graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class PathExists {
    public static boolean validPath(int n, int[][] edges, int start, int end) {
        /************ Building graph  Start ***************/

        HashMap<Integer,ArrayList<Integer>> graph=new HashMap<>();
        for(int i=0;i<n;i++) {
            graph.put(i,new ArrayList<>());
        }
        for(int[] row:edges) {
            graph.get(row[0]).add(row[1]);
            graph.get(row[1]).add(row[0]);
        }

       for(Map.Entry<Integer,ArrayList<Integer>> entry:graph.entrySet()) {
           System.out.println(entry.getKey() +" "+ entry.getValue());
       }

        /************ Building graph  End ***************/

        boolean[] visited = new boolean[n];
        Stack<Integer> stack= new Stack<Integer>();
        stack.add(start);
        visited[start] = true;
        while (!stack.isEmpty()) {
            int current = stack.pop();
            if (current == end) return true;
            for (int neighbor : graph.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    stack.add(neighbor);
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int n = 6;
        int[][] edges = {
                {0, 1},
                {0, 2},
                {3, 5},
                {5, 4},
                {4, 3}
        };
        int start = 0;
        int end = 5;
        System.out.println(validPath(n, edges, start, end));
    }
}
