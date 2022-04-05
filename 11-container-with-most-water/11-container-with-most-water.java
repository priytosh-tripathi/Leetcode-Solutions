class Solution 
{
    public int maxArea(int[] a) 
    {
        int n = a.length;
        int max=0;
        int p1=0;int p2=n-1;
        while(p1<p2)
        {
            max =  Math.max(max,Math.min(a[p1], a[p2]) * (p2 - p1));
            if(a[p1]<a[p2])
                p1+=1;
            else
                p2-=1;
        }
        return max;
    }
}
