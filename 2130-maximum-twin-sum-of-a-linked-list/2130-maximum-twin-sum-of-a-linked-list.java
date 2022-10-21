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
    public int pairSum(ListNode head) {
        ArrayList<Integer> nodes = new ArrayList<>();
        ListNode current = head;
        int twinSum=0;
        while(current!=null){//we added all the values of the ll into the arraylist
            nodes.add(current.val);
            current=current.next;
        }
        
        for(int i=0;i<nodes.size()/2;i++){
            twinSum=Math.max(twinSum,nodes.get(i)+nodes.get(nodes.size()-1-i));
        }
        
        return twinSum;
       }
        
    }
