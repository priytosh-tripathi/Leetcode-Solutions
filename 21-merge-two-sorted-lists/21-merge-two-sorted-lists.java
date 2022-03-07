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
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode a, ListNode b) 
    {
        ListNode res=new ListNode(0);
        ListNode temp=res;
        while(a!=null && b!=null)
        {
            if(a.val<=b.val)
            {
                temp.next=a;
                a=a.next;
                
            }
            else
            {
                temp.next=b;
                b=b.next;
            }
            temp=temp.next;
        }
        if(a!=null) temp.next=a;
        
        if(b!=null) temp.next=b;
        return res.next;
    }
}