class Solution 
{
    public int minCostClimbingStairs(int[] cost) 
    {
        int  n = cost.length;
        int dp[] = new int[n+1];
        dp[n]=0;
        
        dp[0] = cost[0];
        dp[1] = cost[1];
        
        for(int i=2;i<=n;i++)
        {
            if(i==n)
                dp[i] = Math.min(dp[i-1],dp[i-2]);
            else
                dp[i] = cost[i]+Math.min(dp[i-1],dp[i-2]);
        }
        
        return dp[n];
        
    }
}