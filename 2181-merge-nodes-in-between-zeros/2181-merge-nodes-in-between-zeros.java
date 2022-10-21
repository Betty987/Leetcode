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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        ListNode current = head;//head is always 0
        
        while(current!=null){
            current=current.next;
            int sum = 0;
            while(current!=null&&current.val!=0){
                sum+=current.val;
                current=current.next;
            }
            if(sum!=0){
                 tail.next = new ListNode(sum);
                 tail=tail.next;
            }
          
        }
        return dummy.next; 
    }
}