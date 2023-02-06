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
    
    public List<String> binaryTreePaths(TreeNode root) 
    {
        List<String> ans = new ArrayList<>();
        if(root!=null) formBST(root,"",ans);
        return ans;
    }
    
    public void formBST(TreeNode root,String pat,List<String> ans)
    {
        if(root.left==null && root.right==null) {
            ans.add(pat+root.val);
            return;
        }
        if(root.left!=null) {
            formBST(root.left,pat+root.val+"->",ans);
        }
        if(root.right!=null) {
            formBST(root.right,pat+root.val+"->",ans);
        }
        return;
    }
}