class Solution {
    public int countOdds(int low, int high) 
    {
        int base = ((high-low-1)/2)+1;
        if(low!=high && low%2!=0 && high%2!=0)
            base+=1;
        else if(low==high && low%2==0 && high%2==0)
            base-=1;
        return base;
    }
}