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
    public ListNode rotateRight(ListNode head, int k) 
    {
        if(head==null || k==0) return head;
        ListNode temp=head;
        int len=0;
        while(temp!=null)
        {
            temp=temp.next; len++;
        }
       
        k=k%len;
         if(len==1 || k==0) return head;
        int step=1; temp=head;
        while(step<len-k)
        {
            temp=temp.next; ++step;
        }
        ListNode root=temp.next;
        temp.next=null;
        ListNode t=root;
        while(t.next!=null)
        {
            t=t.next;
        }
        t.next=head;
        return root;
    }
}