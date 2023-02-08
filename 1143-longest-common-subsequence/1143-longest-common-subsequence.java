class Solution 
{
    public int longestCommonSubsequence(String text1, String text2) 
    {
        int n1 = text1.length();
        int n2 = text2.length();
        
        char s1[] = text1.toCharArray();
        char s2[] = text2.toCharArray();
        
        int dp[][] = new int[n1+1][n2+1];
        
        for(int i=1;i<n1;i++){
                dp[i][0] = 0;
        }
        for(int i=1;i<n2;i++){
                dp[0][i] = 0;
        }
        
        dp[0][0] = 0;
        
        for(int i=1;i<=n1;i++)
        {
            for(int j=1;j<=n2;j++)
            {
                if(s1[i-1]==s2[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        
        return dp[n1][n2];
    }
}