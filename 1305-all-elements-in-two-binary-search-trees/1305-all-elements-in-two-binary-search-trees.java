/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution 
{    
    ArrayList<Integer> al1;
    ArrayList<Integer> al2;
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) 
    {
        al1 = new ArrayList<>();
        al2 = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        inorder(root1,1);
        inorder(root2,2);
        int i=0; int j=0;
        while(i<=al1.size()-1 && j<=al2.size()-1)
        {
            int t1 = al1.get(i);
            int t2 = al2.get(j);
            if(t1<t2){
                ans.add(t1);
                i++;
            }
            else{
                ans.add(t2);
                j++;
            }
        }
        for(int k=i;k<al1.size();k++)
            ans.add(al1.get(k));
        for(int k=j;k<al2.size();k++)
            ans.add(al2.get(k));
        return ans;
    }
    
    public void inorder(TreeNode root,int c)
    {
        if(root==null)
            return;
        inorder(root.left,c);
            if(c==1)
             al1.add(root.val);
            if(c==2)
             al2.add(root.val);
        inorder(root.right,c);
    }
    
}