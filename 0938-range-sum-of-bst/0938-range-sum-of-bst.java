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
    public int rangeSumBST(TreeNode root, int low, int high) 
    {
        ans = 0;
        sol(root,low,high);
        return ans;
    }
    
    public void sol(TreeNode root, int low, int high)
    {
        if(root==null)
            return;
        if(root.val<low){
          sol(root.right,low,high);
            return;
        }
        else if(root.val>high){
            sol(root.left,low,high);
        }
        else{
            ans = ans+root.val;
            if(root.left!=null)
                sol(root.left,low,high);
            if(root.right!=null)
                sol(root.right,low,high);
            return;
        }
    }
}