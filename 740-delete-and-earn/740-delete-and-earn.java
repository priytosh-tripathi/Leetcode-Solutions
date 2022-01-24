class Solution {
    public int deleteAndEarn(int[] nums) 
    {
        int [] count= new int[10001];
        for(int num : nums)
        {
            count[num]++;
        }
        int incl=count[1]*1;
        int excl=0;
        for(int i=2;i<10001;i++)
        {
            int excl_new=Math.max(incl,excl);
            incl=excl+count[i]*i;
            excl=excl_new;
        }
        return Math.max(incl,excl);
        
    }
}