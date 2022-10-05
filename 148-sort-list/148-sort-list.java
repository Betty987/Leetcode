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
        if(head==null || head.next==null)
            return head;
        
        ListNode l1 = head,l2=splitmidnode(head);
        
        l1=sortList(l1);
        l2 = sortList(l2);
        
        ListNode dummy = new ListNode(),res=dummy;
        
        while(l1!=null&&l2!=null){
            if(l1.val < l2.val){
                res.next = l1;
                l1=l1.next;
            }
            else{
                res.next = l2;
                l2=l2.next;
            }
         res=res.next;
        }
        if(l1!=null){//but l2 is null
            res.next=l1;
        }
        else{//l1 is null
            res.next=l2;
        }
        
       return dummy.next;
      
    }
    
    private ListNode splitmidnode(ListNode head){
        ListNode temp=null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            temp=slow;
            fast=fast.next.next;
            slow=slow.next;
            
        }
        temp.next=null;//temp is the end of the left half
        return slow;//slow is the head of the right half
        
    }
    
    

    }