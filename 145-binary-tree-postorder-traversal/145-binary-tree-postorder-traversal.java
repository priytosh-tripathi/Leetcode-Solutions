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
    public List<Integer> postorderTraversal(TreeNode root) 
    {
        ArrayList<Integer> al=new ArrayList<>();
        if(root==null) return al;
        Stack<TreeNode> s=new Stack<>();
        s.push(root);
        while(!s.isEmpty())
        {
            TreeNode t=s.pop();
            al.add(0,t.val);
            if(t.left!=null) s.push(t.left);
            if(t.right!=null) s.push(t.right);
        }
        return al;
        
    }
}