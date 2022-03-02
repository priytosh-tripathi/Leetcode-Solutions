class Solution 
{
    public boolean isSubsequence(String s, String t) 
    {
        int i=0;
        int j=0;
        int l1 = s.length();
        int l2 = t.length();
        while(i<l1 && j<l2)
        {
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        if(i==l1)
            return true;
        else
            return false;
    }
}