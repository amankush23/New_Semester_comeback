// Last updated: 06/05/2026, 20:54:03
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
12    public ListNode rotateRight(ListNode head, int k) {
13        if (head == null) return head;
14
15        int length = 1;
16        ListNode dummy = head;
17
18        while (dummy.next != null) {
19            dummy = dummy.next;
20            length++;
21        }
22
23        int position = k % length;
24        if (position == 0) return head;
25
26        ListNode current = head;
27        for (int i = 0; i < length - position - 1; i++) {
28            current = current.next;
29        }
30
31        ListNode newHead = current.next;
32        current.next = null;
33        dummy.next = head;
34
35        return newHead;        
36    }
37}