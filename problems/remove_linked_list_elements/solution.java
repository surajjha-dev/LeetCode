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
    public ListNode removeElements(ListNode head, int val) {
            
        if (head == null)
          return null;
            
        ListNode falseNode = new ListNode(-1);
        
        falseNode.next = head;
        
        ListNode prev = falseNode; 
            
        while (head != null) {
                
            if (head.val == val) {
                 prev.next = head.next;
                 head = head.next;   
            }  else {
                 head = head.next;
                 prev = prev.next;
            }  
        }
            
        return falseNode.next;
    }
}