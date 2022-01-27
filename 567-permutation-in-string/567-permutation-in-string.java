class Solution 
{
    public boolean checkInclusion(String s1, String s2) 
    {
        
        int l1 = s1.length();
        int l2 = s2.length();
        char my[] = s1.toCharArray();
        Arrays.sort(my);
        String sample = new String(my);
       // System.out.println("Sample is -> "+sample);
        for(int i=0;i<=l2-l1;i++){
            String temp = s2.substring(i,i+l1);
            char temp2[] = temp.toCharArray();
            Arrays.sort(temp2);
            String out = new String(temp2);
         //   System.out.println("Temp is -> "+out);
            if(out.equals(sample))
                return true;
        }
        return false;
    }
}