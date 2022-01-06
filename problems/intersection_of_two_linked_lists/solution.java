/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lA = 0, lB = 0;
        ListNode tempA = headA, tempB = headB;
            
        while (tempA != null) {
           lA++;
           tempA = tempA.next;
        }
        while (tempB != null) {
           lB++;
           tempB = tempB.next;
        }
        
        int shift = Math.abs(lA-lB);
        
        tempA = headA;
        tempB = headB;
        if (lA > lB) {
           while (shift != 0) {
             tempA = tempA.next;
             shift--;
           }   
        } else {
           while (shift != 0) {
             tempB = tempB.next;
             shift--;
           }     
        }    
        
        while ( tempA != tempB ) {
           tempA = tempA.next;
           tempB = tempB.next;
        }
            
        return tempA;    
    }
}