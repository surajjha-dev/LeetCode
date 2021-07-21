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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if (head.next == null && n > 0)
                return null;
            
        ListNode Head = head;
        
        // Using slow and faster pointer with n number of distance    
        ListNode previousOfP1 = head, p1 = head, p2 = head;
            
        // move the second pointer n places ahead    
        for (int i = 1; i<n; i++) {
                p2 = p2.next;
        }    
            
        while (p2 != null && p2.next != null) {
             
             previousOfP1 = p1;
                 
             p1 = p1.next;    
                
             p2 = p2.next;   
         
        }
            
        if (p1 == Head) 
           Head = p1.next;
        
        previousOfP1.next = p1.next;               
            
        return Head;    
    }
}