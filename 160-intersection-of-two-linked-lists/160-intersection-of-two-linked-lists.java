/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        ListNode res = null;
        if(headA==null||headB==null)
            return res;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int c1=1;
        int c2=1;
        while(temp1!=null)
        {
            c1++;
            temp1=temp1.next;
        }
        while(temp2!=null)
        {
            c2++;
            temp2=temp2.next;
        }
        temp1 = headA;
        temp2 = headB;
        if(c1>c2)
        {
            int dif = c1-c2;
            while(dif>0)
            {
                temp1=temp1.next;
                dif--;
            }
        }
        else
        {
            int dif = c2-c1;
            while(dif>0)
            {
                temp2=temp2.next;
                dif--;
            }
        }
        while(temp1!=null && temp2!=null)
        {
            if(temp1==temp2)
            {
                res = temp1;
                break;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return res;
    }
}