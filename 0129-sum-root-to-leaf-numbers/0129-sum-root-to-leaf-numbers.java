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
    int ans;
    public int sumNumbers(TreeNode root) 
    {
        ans = 0;
        if(root==null)
            return 0;
        sum(root,""+root.val);
        return ans;
    }
    public void sum(TreeNode root, String tmp) 
    {
        if(root.left==null && root.right==null){
            int x = Integer.parseInt(tmp);
            ans+=x;
            return;
        }
        if(root.left!=null){
            sum(root.left,tmp+root.left.val);
        }
        if(root.right!=null){
            sum(root.right,tmp+root.right.val);
        }
        return;
    }
}