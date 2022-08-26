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
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null) return head;
        //split in half
        ListNode l1=head;
        ListNode l2=splitmidnode(head);
        //sort
        l1=sortList(l1);
        l2=sortList(l2);
        
        ListNode dummy=new ListNode(),res=dummy;
        
        while(l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                res.next=l1;
                l1=l1.next;
            }
            else{
                res.next=l2;
                l2=l2.next;
            }
            res=res.next;  
        }
        if(l2!=null){
            res.next=l2;
           
        }
        else{
            res.next=l1;
          
        }
        
       return dummy.next; 
    }
    
    
    private ListNode splitmidnode(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=head;
        
        while(fast!=null&&fast.next!=null){
             temp=slow;
            slow=slow.next;
            fast=fast.next.next;  
        }
        temp.next=null;
        return slow;
    }
}