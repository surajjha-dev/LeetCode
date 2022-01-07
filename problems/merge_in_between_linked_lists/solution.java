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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode prevA = list1, nextB = list1;
            
        for (int i = 1; i < a; i++) {
             prevA = prevA.next;
        }
            
        nextB = prevA;
            
        for (int j = a; j <= b; j++) {
             nextB = nextB.next;
        }   
            
        prevA.next = list2;
        
        while (prevA.next != null) {
          prevA = prevA.next;
        }
            
        prevA.next = nextB.next;
            
        return list1;
    }
}