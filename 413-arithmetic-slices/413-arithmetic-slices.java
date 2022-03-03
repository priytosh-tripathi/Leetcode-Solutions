class Solution 
{
    public int numberOfArithmeticSlices(int[] nums) 
    {
        
        int f=1;
        int l = nums.length;
        if(l<2)
            return 0;
        int std = nums[1]-nums[0];
        int sum=0;
        for(int i=2;i<l;i++)
        {
            if(nums[i]-nums[i-1]==std){
                f++;
            }
            else{
                if(f>=2)
                {
                    if(f==2)
                    sum+=1;
                    else if(f==3)
                    sum+=3;
                    else{
                    int x = f-1;
                    sum = sum + ((x * (x+1)/2));
                    }
                }
                std = nums[i]-nums[i-1];
                f=1;
            }
        }
        //System.out.println("F = "+f);
        if(f>=2)
        {
            if(f==2)
                sum+=1;
            else if(f==3)
                sum+=3;
            else{
           // int x = f-1;
            sum = sum + ((f * (f-1)/2));
            }
        }
        return sum;
    }
}