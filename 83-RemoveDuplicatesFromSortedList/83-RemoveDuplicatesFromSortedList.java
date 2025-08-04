// Last updated: 8/4/2025, 11:13:10 PM
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
        // Edge case: if the list is empty or has only one node
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;

        // Traverse the list
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                // Duplicate found: skip the next node
                current.next = current.next.next;
            } else {
                // Move to the next node
                current = current.next;
            }
        }

        return head;
    }
}
