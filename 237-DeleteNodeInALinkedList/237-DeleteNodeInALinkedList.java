// Last updated: 8/4/2025, 11:12:14 PM
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
        // node.next.next = null;
    }
}