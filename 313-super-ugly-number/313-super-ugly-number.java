class Solution 
{
    public int nthSuperUglyNumber(int n, int[] A) 
    {
        int l = A.length;
        int p[] = new int[l];
        int dp[] = new int[n+1];
        
        dp[0]=1;
        
        for(int i=1;i<=n;i++)
        {
            int min = Integer.MAX_VALUE;
            for(int j=0;j<l;j++)
            {
                int temp = A[j]*dp[p[j]];
                min = temp<min?temp:min;
            }
            for(int j=0;j<l;j++)
            {
                if(A[j]*dp[p[j]]==min)
                    p[j]++;
            }
            
            dp[i] = min;
            //System.out.println("DP["+i+"] = "+dp[i]);
        }
        return dp[n-1];
    }
}