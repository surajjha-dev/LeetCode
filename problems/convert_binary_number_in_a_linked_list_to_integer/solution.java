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
    public int getDecimalValue(ListNode head) {
        
        int decimalEquivalent = 0;
            
        List<Integer> result = new ArrayList<Integer>();    
            
        while (head != null) {
             result.add(head.val);
                
             head = head.next;                  
        }
            
        int base = 0;    
        for (int i = result.size()-1; i>=0; i--) {
               decimalEquivalent += result.get(i)*Math.pow(2, base);
               base++; 
        }
            
        return decimalEquivalent;
            
    }
}