class Solution 
{
    public List<Integer> findAnagrams(String s, String p) 
    {
        int freq_p[] = new int[26];
        int mod_val = 0;
        List<Integer> ans = new ArrayList<>();
        
        for(char x : p.toCharArray()) {
            freq_p[x-'a']++;
            mod_val = mod_val+(x-'a');
        }
        
        int l = p.length();
        int e = s.length()-l;
        
        for(int i = 0;i <= e; i++ ) {
            String window = s.substring(i,i+l);
            int freq_w[] = new int[26];
            int mod = 0;
            for(char q : window.toCharArray()) {
                freq_w[q-'a']++;
                mod = mod + (q-'a');
            }
            if(mod==mod_val) {
                if(compare(freq_w,freq_p)) {
                    ans.add(i);
                }
            }
        }
        return ans;
    }
    
    public boolean compare(int freq_w[],int freq_p[]) 
    {
        for(int i=0;i<freq_p.length;i++){
            if(freq_w[i]!=freq_p[i])
                return false;
        }
        return true;
    }
    
}