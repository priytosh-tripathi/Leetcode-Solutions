class Solution {
    public int[] productExceptSelf(int[] nums) {
        long prod = 1;int c=0;
        for(int n : nums){
            if(n!=0)
            prod = prod * n;
            else
                c++;
        }
        int ans[] = new int[nums.length];
        for(int i=0; i<nums.length; i++)
        {
            ans[i] = (int)(nums[i]==0 ? (c==1 ? prod : 0) : (c>0 ? 0 : prod / nums[i])); 
        }
        return ans;
    }
}