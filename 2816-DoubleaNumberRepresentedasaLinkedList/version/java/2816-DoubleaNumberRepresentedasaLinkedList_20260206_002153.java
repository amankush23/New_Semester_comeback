// Last updated: 06/02/2026, 00:21:53
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12        public ListNode doubleIt(ListNode head) {
13        if (head.val > 4)
14            head = new ListNode(0, head);
15        for(ListNode node = head; node != null; node = node.next) {
16            node.val = (node.val * 2) % 10;
17            if (node.next != null && node.next.val > 4)
18                node.val++;
19        }
20        return head;
21    }
22}