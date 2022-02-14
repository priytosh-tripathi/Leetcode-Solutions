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
    int max = Integer.MIN_VALUE;
    public int maxDepth(TreeNode root) 
    {
        if(root==null)
            return 0;
        inorder(root,1);
        return max;
    }
    
    public void inorder(TreeNode root,int level)
    {
        if(root==null)
            return;
        max = level>max?level:max;
        inorder(root.left,level+1);
        inorder(root.right,level+1);
    }
}