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
    public ListNode partition(ListNode head, int x) {
        ListNode d1= new ListNode();
        ListNode d2= new ListNode();
        ListNode low=d1;
        ListNode high=d2;
        if(head==null||head.next==null) return head;
        ListNode cur=head;
        while(cur!=null){
            if(cur.val<x){
                low.next=cur;
                low=cur;
            }else{
                high.next=cur;
                high=cur;
                
            }
            cur=cur.next;
        }
        low.next=d2.next;
        high.next=null;
        return d1.next;
    }
}