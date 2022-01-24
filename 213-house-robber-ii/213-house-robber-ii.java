class Solution 
{
    public int rob(int[] nums) 
    {
        int l = nums.length;
        
        if(l==0)
            return 0;
        else if(l==1)
            return nums[0];
        
        int inc0 = robber(nums,0,l-2);
        int exc0 = robber(nums,1,l-1);
        
        return Math.max(inc0,exc0);
    }
    
    public int robber(int nums[],int start,int end)
    {
        int p1=0;
        int p2=0;
        for(int i=start;i<=end;i++)
        {
            int cur = Math.max(nums[i]+p2,p1);
            int temp = p1;
            p1=cur;
            p2=temp;
        }
        return p1;
    }
}