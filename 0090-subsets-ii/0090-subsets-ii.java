class Solution 
{
    public List<List<Integer>> subsetsWithDup(int[] nums) 
    {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        HashSet<List<Integer>> hs = new HashSet();
        res.add(curr);
        for(int x : nums)
        {
            int l = res.size();
            for(int i=0;i<l;i++){
                List<Integer> temp = new ArrayList(res.get(i));
                temp.add(x);
                Collections.sort(temp);
                if(!hs.contains(temp))
                {
                    res.add(temp);
                    hs.add(temp);
                }
            }
        }
        return res;
    }
}