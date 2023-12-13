class Solution 
{    
    public String reverseWords(String s) 
    {
        
        String args[] = s.trim().split("\\s+");
        int i=0; int j=args.length-1; 
        
        while(i<j && i<args.length && j>=0)
        {
            String temp = args[i];
            args[i] = args[j];
            args[j] = temp;
            i++;j--;
        }
        
        String ans = "";
        
        for(int k=0;k<args.length;k++)
        {
            ans = ans+args[k]+" ";
        }
        
        return ans.trim();
        
    }
}