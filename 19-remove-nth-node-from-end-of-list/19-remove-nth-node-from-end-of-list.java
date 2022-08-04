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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode();
        ListNode slow=dummy;
        ListNode fast=dummy;
        dummy.next=head;
        for(int i=1;i<=n+1;i++){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;//slow gets one position before the element to be removed
            
        }
        slow.next=slow.next.next;//deleting the eelement
        
        return dummy.next;
    }
}