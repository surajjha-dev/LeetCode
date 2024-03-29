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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       
          ListNode p, dummy = new ListNode(0);
          p = dummy;  
            
          while (l1 != null || l2 != null) {
              if (l1 == null) {
                 p.next = new ListNode(l2.val);
                 l2 = l2.next;
                 p = p.next;
              }  else if (l2 == null) {
                 p.next = new ListNode(l1.val);
                 l1 = l1.next;
                 p = p.next;
              } else if (l2.val <= l1.val) {
                   p.next = new ListNode(l2.val);
                   l2 = l2.next;
                   p = p.next;
              } else if (l1.val <= l2.val) {
                   p.next = new ListNode(l1.val);
                   l1 = l1.next;
                   p = p.next;  
              }          
         }
            
         return dummy.next;            
    }
}