class Solution {
    class pair
    {
        int v, d;
        pair(int v,int d)
        {
            this.v=v; this.d=d;
        }
    }
    public int snakesAndLadders(int[][] board) 
    {
        int l=board.length;
        boolean[] vis= new boolean[l*l+1];
        int[] b= new int[l*l+1];
        int c=1; boolean flag=true;
        for(int i=l-1;i>=0;i--)
        {
            if(flag)
            {
                for(int j=0;j<l;j++)
                {
                    b[c++]=board[i][j];
                }
                
            }
            else
            {
                for(int j=l-1;j>=0;j--)
                {
                    b[c++]=board[i][j];
                }
            }
            flag=!flag;
            
        }
        
        Queue<pair>q= new LinkedList<>();
        q.add(new pair(1,0));
        vis[1]=true;
        while(!q.isEmpty())
        {
            pair x=q.remove();
            int val=x.v; int dis=x.d;
            
            if(val==l*l)
            {
                return dis;
            }
            for(int i=1;i<=6;i++)
            {
                if((val+i)<=l*l && !vis[val+i])
                {
                    pair t= new pair(val+i, dis+1);
                    vis[val+i]=true;
                    if(b[val+i]!=-1)
                    {
                        t.v=b[val+i];
                    }
                    q.add(t);
                }
                
            }
        }
        return -1;
        
    }
}