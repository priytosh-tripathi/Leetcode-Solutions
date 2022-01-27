class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length==0) return 0;
        
        int min = nums[0];
        int max = nums[0];
        int result = nums[0];
        
        for (int i=1; i<nums.length; i++) {
            int temp_max = Math.max(nums[i]*max, Math.max(nums[i], nums[i]*min));
            min =  Math.min(nums[i]*max, Math.min(nums[i], nums[i]*min));
            
            max = temp_max;
            result = Math.max(result, max);
        }
        
        return result;   
    }
}