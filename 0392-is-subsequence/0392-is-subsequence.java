class Solution {
    public boolean isSubsequence(String str, String ttr) {
        
        char s[] = str.toCharArray();
        char t[] = ttr.toCharArray();
        int slen = s.length;
        int tlen = t.length;
        int i=0;int j=0;
        while(i<slen && j<tlen)
        {
            if(s[i]==t[j]){
                i++;
            }
            j++;
        }
        if(i==slen)
            return true;
        else
            return false;
        
    }
}