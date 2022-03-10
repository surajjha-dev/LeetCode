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
    public ListNode deleteDuplicates(ListNode head) {
            
        if (head == null || head.next == null)
                 return head;
            
        ListNode dummyHead = new ListNode(0, head);
        ListNode prev = head; 
            
        while (head != null) {
                
            ListNode curr = head;
                
            // from a pointer traversing till the next value is same     
            while (curr.next != null && curr.next.val == curr.val) {
                 curr = curr.next;   
            }
             
            // if first few elements are same then head need to be changed with new    
            if (prev == head && curr != head) {    
                head = curr.next;
                prev = head;
                dummyHead.next = head;    
            } else {
                    
                // if consecutive elements are same then prev next should be curr next   
                if (curr != head) {
                   prev.next = curr.next;     
                   head = curr.next;     
                } else {
                    // otherwise move it ahead.   
                    prev = head;
                    head = head.next;       
                }    
            }            
        }    
            
        return dummyHead.next;    
    }
}