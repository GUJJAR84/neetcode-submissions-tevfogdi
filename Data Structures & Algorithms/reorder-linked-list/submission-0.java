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
    public void reorderList(ListNode head) {
        if(head==null||head.next==null)return;
        ListNode p1=head;
        ListNode p2=head;
        while(p2.next!=null && p2.next.next!=null){
            p1=p1.next;
            p2=p2.next.next;
        }
        ListNode curr=p1.next;
        p1.next=null;
        ListNode prev = null;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr=temp;
        }
        p1=head;
        p2= prev;
        while(p2!=curr){
            ListNode t1=p1.next;
            ListNode t2 = p2.next;
            p1.next=p2;
            p2.next=t1;
            p1=t1;
            p2=t2;
        }
    }
}
