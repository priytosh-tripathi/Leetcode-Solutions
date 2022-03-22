class Solution 
{
    public String getSmallestString(int n, int k) 
    {
        char ans[] = new char[n];
        Arrays.fill(ans,'a');
        k = k-n; int i=n-1;
        while(k>=25)
        {
            ans[i--] = 'z';
            k-=25;
        }
        if(k>=0 && i>=0)
        {
            ans[i] = (char)(k+97);
        }
        return String.valueOf(ans);
    }
}