class Solution {
    public int majorityElement(int[] nums) {
       HashMap<Integer,Integer> hm = new HashMap<>();
       int len = nums.length; 
        for(int i=0;i<len;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                int a = hm.get(nums[i]);
                ++a;
                if(a>(int)(len/2))
                {
                        hm.put(nums[i],a);
                        return nums[i];
                }
                   hm.put(nums[i],a);
            }
            else
            {
                hm.put(nums[i],1);
                if(1>(int)(len/2))
                {
                        hm.put(nums[i],1);
                        return nums[i];
                }
            }
        }
        return 0;
    }
}