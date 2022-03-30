class Solution {
    public boolean searchMatrix(int[][] M, int target) 
    {
        int m=M.length;
        int n=M[0].length;
        int row=0, col=n-1;
        while(row<m && col>=0)
        {
            if(M[row][col]==target)
                return true;
            if(M[row][col]<target)
            {
                row++;
            }
            else 
            {
                col--;
            }
        }
        return false;
    }
}