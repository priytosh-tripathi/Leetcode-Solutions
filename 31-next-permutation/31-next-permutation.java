class Solution {
    public void nextPermutation(int[] nums) 
    {
        int n=nums.length;
        int pos=-1; int swap=-1,index=-1;
        for(int i=n-1;i>0;i--)
        {
            if(nums[i]>nums[i-1])
            {
                pos=i-1;
                break;
            }
        }
        if(pos==-1){
            Arrays.sort(nums);
            return;
        } 
        for(int i=n-1;i>=0;i--)
        {
            if(nums[i]>nums[pos])
            {
                swap=nums[i];
            
                index=i;
                break;
            }
        }
        nums[index]=nums[pos];
        nums[pos]=swap;
        pos++;
        while(pos<n)
        {
            int t=nums[pos];
            nums[pos]=nums[n-1];
            nums[n-1]=t;
            pos++; n--;
        }
    }
}