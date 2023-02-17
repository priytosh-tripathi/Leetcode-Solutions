class Solution 
{
    public int climbStairs(int n) 
    {
        if(n<=2)
         return n;
        int dp0 = 1; int dp1=2; int dp2=3;
        for(int i=3;i<=n;i++)
        {
            dp2 = dp0+dp1;
            dp0 = dp1; dp1=dp2;
        }
        return dp2;
    }
}