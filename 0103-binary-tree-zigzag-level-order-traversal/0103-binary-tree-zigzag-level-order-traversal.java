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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) 
    {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null)
         return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        boolean flag = true;
        
        while(!q.isEmpty())
        {
            ArrayList<Integer> al = new ArrayList<>();
            int size = q.size();
            for(int i=1;i<=size;i++)
            {
                TreeNode temp = q.remove();
                if(temp==null)
                 continue;
                if(flag){
                    al.add(temp.val);
                }
                else{
                    al.add(0,temp.val);
                }
                if(temp.left!=null){
                 q.add(temp.left);   
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            ans.add(al);
            flag=!flag;
        }
        return ans;
    }
}