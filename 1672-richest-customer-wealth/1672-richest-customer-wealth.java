class Solution 
{
    public int maximumWealth(int[][] ac) 
    {
        int max = Integer.MIN_VALUE;
        int m = ac.length;
        int n = ac[0].length;
        for(int i=0;i<m;i++)
        {
            int sum = 0;
            for(int j=0;j<n;j++)
            {
                sum+=ac[i][j];
            }
            max = sum>max?sum:max;
        }
        return max;
    }
}