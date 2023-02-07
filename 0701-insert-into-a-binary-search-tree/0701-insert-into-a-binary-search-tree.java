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
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) 
    {
        if(root==null)
            return new TreeNode(val);
        BST(root,val);
        return root;
    }
    
    public void BST(TreeNode root, int val) 
    {
        if(root.val<val){
            if(root.right!=null)
                BST(root.right,val);
            else{
                root.right = new TreeNode(val);
                return;
            }
        }
        else{
            if(root.left!=null)
                BST(root.left,val);
            else{
                root.left = new TreeNode(val);
                return;
            }
        }
        return;
    }
}