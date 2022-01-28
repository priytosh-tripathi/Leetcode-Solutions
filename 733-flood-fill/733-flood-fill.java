class Solution 
{
    class pair{
        int r;
        int c;
        pair(int R,int C){
            r=R;
            c=C;
        }
    }
    
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) 
    {
        int m = image.length;
        int n = image[0].length;
        boolean vis[][] = new boolean[m][n];
        int col = image[sr][sc];
        
        Queue<pair> q = new LinkedList<>();
        pair source = new pair(sr,sc);
        q.add(source);
        int[] dir = {0, 1, 0, -1, 0};
        
        while(!q.isEmpty())
        {
            pair temp = q.remove();
            image[temp.r][temp.c] = newColor;
            vis[temp.r][temp.c]= true;
            
            for(int i=0;i<4;i++)
            {
                int new_i=temp.r+dir[i];
                int new_j=temp.c+dir[i+1];
                if(isSafe(image,vis,col,new_i,new_j)){
                    q.add(new pair(new_i,new_j));
                }
            }
        }
        
        return image;
    }
    
    public boolean isSafe(int image[][],boolean vis[][],int color,int i, int j)
    {
        int m = vis.length;
        int n = vis[0].length;
        if(i>=0 && i<m && j>=0 && j<n && !vis[i][j] && image[i][j]==color)
            return true;
        else
            return false;
    }
}