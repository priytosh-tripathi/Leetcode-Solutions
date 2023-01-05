//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tc = scan.nextInt();

        while (tc-- > 0) {
            int N = scan.nextInt();
            int M = scan.nextInt();
            int E = scan.nextInt();

            boolean graph[][] = new boolean[N][N];

            for (int i = 0; i < E; i++) {
                int u = scan.nextInt() - 1;
                int v = scan.nextInt() - 1;
                graph[u][v] = true;
                graph[v][u] = true;
            }

            System.out.println(new solve().graphColoring(graph, M, N) ? 1 : 0);
        }
    }
}

// } Driver Code Ends


class solve {
    // Function to determine if graph can be coloured with at most M colours
    // such
    // that no two adjacent vertices of graph are coloured with same colour.
    public boolean graphColoring(boolean graph[][], int m, int n) 
    {
        int color[] = new int[n];
        if(solve(graph,m,n,0,color))return true;
        return false;
    }
    
    public boolean solve(boolean graph[][],int m,int n,int node,int color[])
    {
        if(node==n)return true;
        
        for(int i=1;i<=m;i++){
            if(isPossible(graph,n,color,i,node))
            {
                color[node] = i;
                if(solve(graph,m,n,node+1,color))return true;
                color[node] = 0;
            }
        }
        return false;
    }
    
    public boolean isPossible(boolean graph[][],int n,int[] color,int i,int node)
    {
        for(int k=0;k<graph[node].length;k++)
        {
            if(graph[node][k]){
                if(color[k]==i)
                 return false;
            }
        }
        return true;
    }
}