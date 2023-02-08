class Solution 
{
    public int[] twoSum(int[] num, int target) 
    {
        int l = num.length;
        int i=0; int j=l-1;
        while(i<j)
        {
            if(num[i]+num[j]==target)
                break;
            else if((num[i]+num[j])>target)
                j--;
            else
                i++;
        }
        int ans[] = new int[2];
        ans[0] = i+1;
        ans[1] = j+1;
        return ans;
    }
}