class Solution 
{
    public List<Integer> addToArrayForm(int[] num, int k) 
    {
        String n = k+"";
        char x[] = n.toCharArray();
        int p = num.length-1;
        int q = x.length-1;
        int carry = 0;
        List<Integer> ans = new ArrayList<>();
        while(p>=0 && q>=0)
        {
            int temp1 = num[p--];
            int temp2 = x[q--]-'0';
            int sum = temp1+temp2+carry;
            carry = sum/10;
            ans.add(0,sum%10);
        }
        
        while(p>=0){
            int sum = num[p--]+carry;
            carry = sum/10;
            ans.add(0,sum%10);
        }
        
        while(q>=0){
            int sum = (x[q--]-'0')+carry;
            carry = sum/10;
            ans.add(0,sum%10);
        }
        
        if(carry>0)
            ans.add(0,carry);
        return ans;
    }
}