class Solution 
{
    public int minimumTotal(List<List<Integer>> triangle) 
    {
        int m = triangle.size();
        for(int i=m-2;i>=0;i--)
        {
            List<Integer> temp = triangle.get(i);
            int n = temp.size();
            for(int j=0;j<n;j++)
            {
                int a = (triangle.get(i+1).get(j))+(temp.get(j));
                int b = triangle.get(i+1).get(j+1)+(temp.get(j));
                triangle.get(i).set(j,new Integer(Math.min(a,b)));
            }
        }
        return triangle.get(0).get(0);
    }
}