class Solution 
{
    public int[] nextGreaterElements(int[] nums) 
    {
        int l = nums.length;
        int ng[] = new int[l];
        
        for(int i=0;i<l;i++)
        {
            boolean flag = false;
            
            for(int j=i+1;j<l;j++)
            {
                if(nums[j]>nums[i])
                {
                    ng[i] = nums[j];
                    flag=true;
                    break;
                }
            }
                if(!flag)
                {
                    for(int j=0;j<i;j++)
                    {
                        if(nums[j]>nums[i])
                        {
                        ng[i] = nums[j];
                        flag=true;
                        break;
                        }
                        
                    }
                }
                if(!flag)
                    ng[i]=-1;
          }
        return ng;
    }
}