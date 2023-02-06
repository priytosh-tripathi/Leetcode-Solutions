class Solution 
{
    public int maxArea(int[] height) 
    {
        int n = height.length;
        int l = 0; int h = n-1;
        int ans = Integer.MIN_VALUE;
        while(l<h)
        {
            int curr_cap = Math.min(height[l],height[h]) * (h-l);
            ans = curr_cap > ans ? curr_cap : ans;
            if(height[l]<height[h])
                l++;
            else
                h--;
        }
        return ans;
    }
}