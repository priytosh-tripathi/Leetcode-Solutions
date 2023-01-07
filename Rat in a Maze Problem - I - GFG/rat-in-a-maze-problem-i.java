//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends

class Solution 
{
    static ArrayList<String> ans;
    public static ArrayList<String> findPath(int[][] m, int n) 
    {
        ans = new ArrayList<>();
        if(m[n-1][n-1]!=1 || m[0][0]!=1)
        {
            ans.add("-1");
            return ans;
        }
        String tmp = "";
        boolean vis[][] = new boolean[n][n];
        solve(m,n,0,0,tmp,vis);
        return ans;
    }
    
    public static void solve(int [][]m, int n, int i, int j, String tmp,boolean vis[][])
    {
        if(i==(n-1) && j==(n-1))
        {
            ans.add(tmp);
            return;
        }
        
        vis[i][j] = true;
        if(isValid(m,n,i-1,j,vis))
            solve(m,n,i-1,j,tmp+"U",vis);
        if(isValid(m,n,i+1,j,vis))
            solve(m,n,i+1,j,tmp+"D",vis); // D
        if(isValid(m,n,i,j-1,vis))    
            solve(m,n,i,j-1,tmp+"L",vis); // L
        if(isValid(m,n,i,j+1,vis))    
            solve(m,n,i,j+1,tmp+"R",vis); // R
        vis[i][j] = false;
        return;
    }
    
    public static boolean isValid(int m[][],int n,int i,int j,boolean vis[][])
    {
        if(i<0 || j<0 || i>=n || j>=n || vis[i][j] || m[i][j]==0)
            return false;
        return true;
    }
}