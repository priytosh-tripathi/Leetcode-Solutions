class Solution 
{
    public int maxProfit(int[] A) 
    {
        int n = A.length;
        if((n==0)||(n==1))
        return 0;
      int r[] = new int[n];
      int max = A[n-1]; 
      for(int i=n-2;i>=0;i--)
      {
          max = A[i]>max?A[i]:max;
          r[i] = max;
      }
        max = -9999;
      for(int i=0;i<n;i++)
         max = (r[i]-A[i])>max?(r[i]-A[i]):max;
      return max;
    }
}