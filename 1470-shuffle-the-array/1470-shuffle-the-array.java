class Solution 
{
    public int[] shuffle(int[] nums, int n) 
    {
        int ans[] = new int[n*2];
        
        int l = 0; int h = n;
        for(int i=0;i<2*n;i++)
        {
            if(i%2==0){
                ans[i] = nums[l];
                l++;
            }
            else {
                ans[i] = nums[h];
                h++;
            }
        }
        
        return ans;
    }
}