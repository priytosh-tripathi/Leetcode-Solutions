class Solution 
{
    public String reverseVowels(String s) 
    {
        char str[] = s.toCharArray();
        int i=0; int j=s.length()-1;
        Set<Character> vowels = new HashSet<>();
        vowels.add('a'); vowels.add('e'); vowels.add('i'); vowels.add('o'); vowels.add('u');
        vowels.add('A'); vowels.add('E'); vowels.add('I'); vowels.add('O'); vowels.add('U');
        while(i<j && i<s.length() && j>=0){
            while(!vowels.contains(s.charAt(i)) && i<s.length() && i<j){
                i++;
            }
            while(!vowels.contains(s.charAt(j)) && j>=0 && i<j){
                j--;
            }
            if(i<j){
                char temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                i++; j--;
            }
        }
        return new String(str);
    }
}