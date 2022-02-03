class Solution 
{
    public int minFallingPathSum(int[][] A) 
    {
        int m = A.length;
        int n = A[0].length;
        for(int i=m-2;i>=0;i--)
        {
            for(int j=0;j<n;j++)
            {
                int a = Integer.MAX_VALUE;
                int c = Integer.MAX_VALUE;
                int b = A[i+1][j]+A[i][j];
                if(j!=0)
                {
                    a = A[i+1][j-1]+A[i][j];
                }
                if(j!=n-1)
                {
                    c = A[i+1][j+1]+A[i][j];
                }
                A[i][j] = Math.min(a,Math.min(b,c));
            }
        }
        int ans = A[0][0];
        for(int i=0;i<n;i++)
            ans = Math.min(ans,A[0][i]);
        
        return ans;
    }  
}