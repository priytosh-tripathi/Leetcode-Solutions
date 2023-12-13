class Solution 
{
    public int compress(char[] chars) 
    {
        int len = chars.length;
        char curr = chars[0];
        int freq = 1;
        String ans = ""+curr;
        for(int i=1;i<len;i++)
        {
            if(chars[i] == curr){
                freq++;
            }
            else{
                curr = chars[i];
                ans = freq>1 ? ans+freq+curr : ans+curr;
                freq=1;
            }
        }
        if(freq>1)
            ans=ans+freq;
        for(int i=0;i<ans.length();i++){
            chars[i] = ans.charAt(i);
        }
        return ans.length();
        
    }
}