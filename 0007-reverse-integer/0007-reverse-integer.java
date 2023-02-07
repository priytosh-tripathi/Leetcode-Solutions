class Solution 
{
    public int reverse(int x) 
    {
        int n = x;
        long s = 0;
        if(x<0)
            n=n*-1;
        while(n>0)
        {
            int d = n%10;
            s=s*10+d;
            n=n/10;
        }
        if(s>Integer.MAX_VALUE || s<Integer.MIN_VALUE)
            return 0;
        if(x<0)
            s=s*-1;
        return (int)s;
    }
}