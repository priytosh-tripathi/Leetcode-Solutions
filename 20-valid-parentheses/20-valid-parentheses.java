class Solution 
{
    public boolean isValid(String str)
    {
        Stack<Character> s = new Stack<>();
        int l = str.length();
        String open = "({[";
        String close = ")}]";
        
        for(int i=0;i<l;i++)
        {
            char ch = str.charAt(i);
            if(ch==')'||ch=='}'||ch==']')
               {
                   int in = close.indexOf(ch);
                   if(!s.isEmpty())
                   {
                       if(s.peek()==open.charAt(in))
                           s.pop();
                       else
                           s.push(ch);
                   }
                else
                   s.push(ch);
               }
            else
            {
                s.push(ch);
            }
        }
        if(s.isEmpty()){
            return true;
        }
        else
            return false;
    }
}