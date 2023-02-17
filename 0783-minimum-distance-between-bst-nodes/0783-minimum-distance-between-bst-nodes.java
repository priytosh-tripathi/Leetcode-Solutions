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
    ArrayList<Integer> al;
    
    public int minDiffInBST(TreeNode root) 
    {
        al = new ArrayList<Integer>();
        inorder(root);
        
        int ans = Integer.MAX_VALUE;
        
        for(int i=1;i<al.size();i++)
           ans = (al.get(i)-al.get(i-1))<ans?(al.get(i)-al.get(i-1)):ans;
        
        return ans;
        
    }
    
    public void inorder(TreeNode root) {
        
        if(root==null)
            return;
        inorder(root.left);
        al.add(root.val);
        inorder(root.right);
        
        return;
    }
}