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
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode temp = null;
        while (head != null) {
           temp = head;
           while (head.next != null && head.next.val == temp.val) {
              head = head.next;
           }
           temp.next = head.next;
           head = head.next;
        }
            return dummy.next;
    }
}