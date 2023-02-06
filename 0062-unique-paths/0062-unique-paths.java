class Solution 
{
    int dRow[] = {0, 1}; // right
    int dCol[] = {1, 0}; // down
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m + 1][n + 1];
        for(int[] arr : dp) 
            Arrays.fill(arr, -1);
        int count = dfs(0, 0, m, n, dp);
        return count;
    }
    
    public int dfs(int i, int j, int m, int n, int[][] dp) {
        int count = 0;
        if(i == m - 1 && j == n - 1) {
            return 1;
        }
        if(dp[i][j] != -1) return dp[i][j];
        for(int a = 0; a < 2; a++) {
            int nRow = i + dRow[a];
            int nCol = j + dCol[a];
            if(nRow >= 0 && nRow < m && nCol >= 0 && nCol < n) {
                count += dfs(nRow, nCol, m, n, dp);
            }
        }
        return dp[i][j] = count;
    }
}