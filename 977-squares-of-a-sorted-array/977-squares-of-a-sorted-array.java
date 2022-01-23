class Solution 
{
    public int[] sortedSquares(int[] nums) 
    {
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            int temp = nums[i]*nums[i];
            nums[i] = temp;
        }
        
        Arrays.sort(nums);
        return nums;
        
    }
}