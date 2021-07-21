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
    public ListNode middleNode(ListNode head) {
        
         // 2 pointers for traversing the LinkedList
         ListNode p1 = head, p2 = head;
            
         while(p2 != null) {
            
            if (p2.next == null)
               break;
                 
            p2 = p2.next.next; 
                 
            p1 = p1.next;    
         }   
          
        return p1;            
    }
}