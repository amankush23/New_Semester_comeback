// Last updated: 05/05/2026, 22:28:08
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
12    public ListNode reverseKGroup(ListNode head, int k) {
13        if (head == null) return null;
14
15        ListNode tail = head;
16        for (int i = 0; i < k; i++) {
17            if (tail == null) return head;
18            tail = tail.next;
19        }
20
21        ListNode newHead = reverse(head, tail);
22        head.next = reverseKGroup(tail, k);
23        return newHead;
24    }
25
26    private ListNode reverse(ListNode cur, ListNode end) {
27        ListNode prev = null;
28        while (cur != end) {
29            ListNode next = cur.next;
30            cur.next = prev;
31            prev = cur;
32            cur = next;
33        }
34        return prev;
35    }
36}