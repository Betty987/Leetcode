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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode current=dummy;
        
        while(current.next!=null&&current.next.next!=null){
            ListNode firstnode=current.next;
            ListNode secondnode = current.next.next;
            firstnode.next=secondnode.next;
            current.next=secondnode;
            current.next.next=firstnode;
            current=current.next.next;
        }
        return dummy.next;
    }
}