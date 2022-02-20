class Solution {
    public int singleNumber(int[] nums) {
        
        int len = nums.length;
        int ans = nums[0];
        for(int i=1;i<len;i++)
            ans = ans^nums[i];
        return ans;
    }
}