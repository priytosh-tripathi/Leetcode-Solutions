class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0; int c=0;
        String ans = "";
        while(i<word1.length() && j<word2.length())
        {
            if(c%2==0){
                ans = ans + word1.charAt(i);
                i++;
            }
            else{
                ans = ans + word2.charAt(j);
                j++;
            }
            c++;
        }
        if(i<word1.length()){
            ans = ans + word1.substring(i);
        }
        if(j<word2.length()){
            ans = ans + word2.substring(j);
        }
        return ans;
    }
}