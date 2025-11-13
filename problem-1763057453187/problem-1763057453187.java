// Last updated: 11/13/2025, 11:40:53 PM
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
    public ListNode reverseList(ListNode head) {
        ListNode curr  = head;
        ListNode prev = null; 
        while(curr!= null ){
             ListNode ahead = curr.next;
             curr.next = prev;
             prev = curr;
             curr= ahead;

        }
        return prev;
    }
}