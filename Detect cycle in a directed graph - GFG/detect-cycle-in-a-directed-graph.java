//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        
        boolean visited[] = new boolean[V];
        boolean recStack[] = new boolean[V];
        
        for(int i=0;i<V;i++)
        {
            if(isCyclic(i,V,adj,visited,recStack))
                return true;
        }
        return false;
    }
    
    private boolean isCyclic(int v,int n,ArrayList<ArrayList<Integer>> adj,boolean visited[],boolean recStack[])
    {
        if(recStack[v])
            return true;
        
        if(visited[v])
            return false;
            
        visited[v] = true;
        recStack[v] = true;
        
        List<Integer> childrens = adj.get(v);
        
        for(Integer c : childrens)
        {
            if(isCyclic(c,n,adj,visited,recStack))
                return true;
        }
        
        recStack[v] = false;
        
        return false;
    }
}