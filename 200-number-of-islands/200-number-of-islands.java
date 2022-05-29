class Solution {
    boolean[][] vis;
    int[] dir={1,0,-1,0,1};
    public boolean isValid(int i, int j, int r, int c)
    {
        return i>=0 && i<r && j>=0 && j<c;
    }
    public void dfs(int i, int j, int m ,int n, char[][] a)
    {
        if(i>=m || j>=n || i<0 || j<0) return;
        vis[i][j]=true;
        for(int k=0;k<4;k++)
        {
            int new_i=i+dir[k];
            int new_j=j+dir[k+1];
            if(isValid(new_i, new_j, m,n) && vis[new_i][new_j]==false && a[new_i][new_j] == '1')
                dfs(i+dir[k], j+dir[k+1], m, n, a);
            
        }
        return;
    }
    public int numIslands(char[][] a) 
    {
        int m=a.length;
        int n=a[0].length;
        vis=new boolean[m][n];
        int ans=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(!vis[i][j] && a[i][j]=='1')
                {
                    ans++;
                    dfs(i,j,m,n,a);
                    
                }
            }
        }
        return ans;
    }
}