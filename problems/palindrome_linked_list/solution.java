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
    public boolean isPalindrome(ListNode head) {
        ListNode headR = head, headT = head;
        
        return checkPalindrome(head);
    }
     
    static boolean checkPalindrome(ListNode head) {
        
         if (head == null)
            return false;
            
        ListNode slow = head, fast = head;
        
        while (fast.next != null && fast.next.next != null) {
             slow = slow.next;
             fast = fast.next.next;
        }
            
        ListNode rev =  reverseList(slow.next);    
        ListNode curr = head;    
        
        while (rev != null) {
            if (rev.val != curr.val)
               return false;
            rev = rev.next;
            curr = curr.next;
        }    
            
        return true;    
    }    
        
    static ListNode reverseList (ListNode head) {
         if (head == null || head.next == null) 
             return head;
            
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