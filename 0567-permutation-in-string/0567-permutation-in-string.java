class Solution {
    public boolean checkInclusion(String str1, String str2) 
    {
        char s1[] = str1.toCharArray();
        Arrays.sort(s1);
        String q = new String(s1);
        //System.out.println(q);
        int l1 = s1.length; int l2 = str2.length();
        int i = 0;
        while(i<=l2-l1)
        {
            String temp = str2.substring(i,i+l1);
            //System.out.println("Temp = "+temp);
            char t[] = temp.toCharArray();
            Arrays.sort(t);
            String temp2 = new String(t);
            //System.out.println("Temp2 = "+temp2);
            if(q.equals(temp2))
                return true;
            i++;
        }
        return false;
    }
}  