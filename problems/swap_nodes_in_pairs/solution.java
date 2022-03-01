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
            
        if (head == null || head.next == null)
           return head;
            
        ListNode dummyHead = new ListNode(0, head);
            
        ListNode p1 = head, p2 = head.next, prev  = null;
         
        while (p2 != null && p1 != null) {
                          
           ListNode nextP2 = p2.next;
           
           p2.next = p1;
                
           if (p1 == head)
               head = p2;     
                
           p1.next = nextP2;
                
           // joining the previous pair by next by keeping the track of last element of previous swapped pair.    
           if (prev == null)
               prev = p1;
           else {
               prev.next = p2;
               prev = p1;    
           }     
                
           p1 = nextP2;
                
           if (p1 != null)
             p2 = p1.next;     
        }
                     
        return head;    
    }
}