/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) 
    {
        if(head==null)
            return null;
        if(head.next==null)
        {
            TreeNode root = new TreeNode(head.val,null,null);
            return root;
        }
        
        ListNode mid_prev = getMid(head);
        ListNode mid = mid_prev.next;
        mid_prev.next = null;
        ListNode LeftList = head;
        ListNode rightList = mid.next;
        mid.next = null;
        //printList(head);
        //System.out.print(mid.val+"-->");
        //printList(rightList);
        TreeNode left = sortedListToBST(head);
        TreeNode right = sortedListToBST(rightList);
        TreeNode root = new TreeNode(mid.val,left,right);
        
        return root;
    }
    
    public void printList(ListNode head)
    {
        while(head!=null)
        {
            System.out.print(head.val+"-->");
            head=head.next;
        }
        return;
    }
    
    public ListNode getMid(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = head; 
        while(fast!=null && fast.next!=null)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        return prev;
    }
}
