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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k <= 0)
            return head;
        int size = 0;
        ListNode tempHead = head;
        while (tempHead != null) {
             size++;
             tempHead = tempHead.next;   
        }
            
        if (k == size)
             return head;   
            
        k = (k % size); 
            
        if (k == 0)
            return head;    
            
        tempHead = head;
        ListNode prev = head;    
        for (int i = 1; i <= (size - k); i++) {
            prev = tempHead;    
            tempHead = tempHead.next;
        }
        prev.next = null;
        prev = tempHead;
        while (tempHead.next != null) {
           tempHead = tempHead.next;       
        }
        tempHead.next = head;
            
        return prev;
    }
        
    public ListNode reverse(ListNode head) {
           ListNode prev = null;
           ListNode curr = head;
           while (curr != null) {
              ListNode next = curr.next;
              curr.next = prev;
              prev = curr;
              curr = next;     
           }
            
           return prev; 
    }    
}