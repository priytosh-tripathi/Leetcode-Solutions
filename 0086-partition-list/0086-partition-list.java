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
class Solution 
{
    public ListNode partition(ListNode head, int x) 
    {
        ListNode p1 = new ListNode(0); ListNode p11 = p1;
        ListNode p2 = new ListNode(0); ListNode p22 = p2;
        ListNode temp = head;
        while(temp!=null)
        {
            if(temp.val<x){
                p11.next = temp;
                p11=p11.next;
            }
            else{
                p22.next = temp;
                p22=p22.next;
            }
            temp=temp.next;
        }
        p11.next=p2.next;
        p22.next=null;
        p1 = p1.next;
        return p1;
    }
}