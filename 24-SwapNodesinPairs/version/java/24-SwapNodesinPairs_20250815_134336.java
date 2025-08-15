// Last updated: 8/15/2025, 1:43:36 PM
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head; // No swap needed
        }

        // Dummy node to handle head swaps
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        while (prev.next != null && prev.next.next != null) {
            ListNode first = prev.next;
            ListNode second = first.next;

            // Swap
            first.next = second.next;
            second.next = first;
            prev.next = second;

            // Move prev pointer two nodes ahead
            prev = first;
        }

        return dummy.next;
    }
}
