class Solution 
{
    public int numDecodings(String s) 
    {
        int dp[] = new int[s.length()+1];
        dp[0] = 1;
        dp[1] = s.charAt(0)=='0' ? 0 : 1;
        for(int i=2;i<=s.length();i++)
        {
            int sd = Integer.valueOf(s.substring(i-1,i));
            int dd = Integer.valueOf(s.substring(i-2,i));
            if(sd>=1)
                dp[i] += dp[i-1];
            if(dd>=10 && dd<=26)
                dp[i] += dp[i-2];
        }
        return dp[s.length()];
        
    }
}