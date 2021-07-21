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
    public ListNode swapNodes(ListNode head, int k) {
        
        if (head.next == null && k > 0)
          return head;
            
        ListNode Head = head;
        
        // Using slow and faster pointer with n number of distance    
        ListNode p1 = head, p2 = head, p3 = head;
            
        // move the second pointer n places ahead    
        for (int i = 1; i<k; i++) {
                p2 = p2.next;
                p3 = p3.next;
        }    
            
        while (p2 != null && p2.next != null) {
                 
             p1 = p1.next;    
                
             p2 = p2.next;   
         
        }
            
        int temp = p1.val;
        p1.val = p3.val;    
        p3.val = temp;
            
        return Head;    
    }
}