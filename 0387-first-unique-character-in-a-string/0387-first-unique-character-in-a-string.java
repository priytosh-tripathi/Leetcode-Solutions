class Solution {
    public int firstUniqChar(String s) 
    {
        int l = s.length();
        int count[] = new int[26];
        Arrays.fill(count,-1);
        int ans = -1;
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(count[(int)(ch-'a')]==-1)
            {
                count[(int)(ch-'a')]=i;
            }
            else
            {
                count[(int)(ch-'a')]=-2;
            }
        }
        for(int i=0;i<26;i++)
        {
            if(count[i]>=0){
                if(ans==-1) ans=count[i];
                else
                {
                    ans=Math.min(ans,count[i]);
                }
            }
                
        }
        return ans;
    }
}