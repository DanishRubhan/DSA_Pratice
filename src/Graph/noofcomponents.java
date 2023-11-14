package Graph;

import java.util.Arrays;
import java.util.Stack;

public class noofcomponents {
    public static void main(String[] args) {
        int n=5;
        int[][] edges={
                {0,2},
                {3,4},
                {1,2}
        };
        int[][] adj=new int[n][n];
        for(int[] row:edges) {
            for(int nn:row) {
                adj[nn][nn]=1;
            }
        }
        for(int[] ed:edges) {
            adj[ed[0]][ed[1]]=1;
            adj[ed[1]][ed[0]]=1;
        }

        for(int[] row:adj) {
            for(int nn:row) {
                System.out.print(nn+" ");
            }
            System.out.println();
        }


        //to find no. of connected componenets
        // by using dfs
        boolean[] visited=new boolean[n];
        Arrays.fill(visited,false);
        int c=0;
        for(int i=0;i<n;i++) {
            if(visited[i]==false) {
                c++;
                dfs(edges,i,visited,adj,n);
            }
        }
        System.out.println(c);

    }

    static void dfs(int[][] edges,int i,boolean[] visited,int[][] adj,int n) {
        Stack<Integer> st=new Stack<>();
        st.push(i);
        visited[i]=true;
        while (!st.isEmpty()) {
            int curr=st.pop();
            for(int next=0;next<n;next++) {
                if(adj[curr][next]==1 && visited[next]==false) {
                    visited[next]=true;
                    st.push(next);
                }
            }
        }

    }
}
