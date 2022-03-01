class Solution 
{
    public String longestPalindrome(String s) 
    {
        if(s==null || s.length()<=1) 
            return s;
        int start=0, end=0;
        int max = 1;
        for(int i=0;i<s.length();i++)
        {
            int even=findLength(s,i,i+1);
            int odd=findLength(s,i,i);
            int len=Math.max(odd,even);
            if(len > start-end && len>max)
            {
                start = i-((len-1)/2);
                end = i+(len/2);
                max = end-start+1;
            }
            //System.out.println("output --> "+s.substring(start, end+1));
        }
        return s.substring(start, end+1);
    }
    public int findLength(String s, int l, int r)
    {
        if(s==null || l>r)
            return 0;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
        {
            l--; 
            r++;
        }
        return r-l-1;
    }
}