class Solution 
{
    public List<Integer> findDuplicates(int[] nums) 
    {
        HashSet<Integer> hs = new HashSet<Integer>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int x : nums)
        {
            if(!hs.contains(x)){
                hs.add(x);
            }
            else{
                ans.add(x);
            }
        }
        return ans;
    }
}