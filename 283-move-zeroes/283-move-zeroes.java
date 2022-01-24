class Solution 
{
    public void moveZeroes(int[] nums) 
    {
        int prev=0; int l=nums.length;
        if(l==1)
            return;
        while(prev<l && nums[prev]!=0)
            prev++;
        int next = prev+1;
        while(next<l && prev<l)
        {
            if(nums[next]!=0 && nums[prev]==0)
            {
                nums[prev]=nums[next];
                nums[next]=0;
                prev++;
            }
            while(prev<l && nums[prev]!=0)
                prev++;
            next++; 
        }
        
    }
}