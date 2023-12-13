class Solution {
    public boolean canPlaceFlowers(int[] fb, int n) {
        if(fb.length==1 && n<2 && fb[0]==0)
            return true;
        if(fb[0]==0 && fb[1]==0 && n>0)
        { 
            fb[0]=1; 
            n--;
        }
        for(int i=1;i<fb.length-1;i++){
            if(fb[i]==0 && fb[i-1]==0 && fb[i+1]==0)
            {
                fb[i]=1; 
                n--;
            }
            if(n<=0)
                return true;
        }
        if(fb[fb.length-1]==0 && fb[fb.length-2]!=1 && n>0)
        {
            fb[fb.length-1] = 1;
            n--;
        }
        if(n<=0)
            return true;
        else
            return false;
    }
}