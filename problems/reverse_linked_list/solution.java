/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 
    given - 1->2->3->4->5-> Null
    return - 5->4->3->2->1->NULL 
 
    prev = null;
    next = 2;
    curr.next = prev;
    prev = curr;
    curr = next;
 
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
       if (head == null || head.next == null)
               return head;
            
       ListNode previous = null;
       ListNode current = head;
       
       while (current != null) {
           ListNode next = current.next;
           current.next = previous;
           previous = current;
           current = next;    
       }       
               
       return previous;        
  }
}