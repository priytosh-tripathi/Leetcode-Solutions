class WordDictionary {
   class TrieNode{
       TrieNode[] child=new TrieNode[26];
       boolean isEnd=false;
       
   }
    TrieNode root;
    public WordDictionary() 
    {
        root=new TrieNode();
    }
    
    public void addWord(String word) 
    {
        TrieNode node=root;
        for(char ch: word.toCharArray())
        {
            if(node.child[ch-'a']==null)
            {
                node.child[ch-'a']=new TrieNode();
            }
            node=node.child[ch-'a'];
        }
        node.isEnd=true;
    }
    
    public boolean search(String word) 
    {
        return solve(word.toCharArray(),0,root);
        
    }
    
    public boolean solve(char[] word, int k, TrieNode temp)
    {
        if(k==word.length) return temp.isEnd;
        char ch=word[k];
        if(word[k]=='.')
        {
            for(int i=0;i<26;i++)
            {
                if(temp.child[i]!=null && solve(word,k+1,temp.child[i])==true) return true;
            }
        }
        else
        {
            return temp.child[ch-'a']!=null && solve(word,k+1,temp.child[ch-'a']);
        }
        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */