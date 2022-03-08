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
public int kthSmallest(TreeNode root, int k) {
    ArrayList<Integer> buffer = new ArrayList<Integer>();
    inorderSearch(root, buffer, k);
    return buffer.get(k-1);
}
public void inorderSearch(TreeNode node, ArrayList<Integer> buffer, int k){
    if(buffer.size() >= k)
        return;
    if(node.left != null){
        inorderSearch(node.left, buffer, k);
    }
    buffer.add(node.val);
    if(node.right != null){
        inorderSearch(node.right, buffer, k);
    }
}
}