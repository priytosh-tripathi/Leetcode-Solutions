class Solution {
    public int coinChange(int[] coins, int amount) 
    {
        int coin = coins.length;
        int dp[][] = new int[coin+1][amount+1];
        Arrays.fill(dp[0],Integer.MAX_VALUE-1);
        for(int i=1;i<=coin;i++)
            dp[i][0] = 0;
        
        for(int i=1;i<=coin;i++)
        {
            for(int j=1;j<=amount;j++)
            {
             if(coins[i-1]<=j)
             {
                 dp[i][j] = Math.min(dp[i][j-coins[i-1]]+1,dp[i-1][j]);
             }
            else
                dp[i][j] = dp[i-1][j];
                    
            }
        }
        if(dp[coin][amount]==Integer.MAX_VALUE-1)
            return -1;
        return dp[coin][amount];
    }
}