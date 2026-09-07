// Last updated: 07/09/2026, 22:51:56
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
12
13    public int lengthLinkedList(ListNode head) {
14        int l = 0;
15
16        while (head != null) {
17            l++;
18            head = head.next;
19        }
20
21        return l;
22    }
23
24    public ListNode removeNthFromEnd(ListNode head, int n) {
25        int length = lengthLinkedList(head);
26
27        if (length == n) { // Nth node from end is the first node
28            return head.next;
29        }
30
31        ListNode temp = head;
32        ListNode prev = null;
33
34        int travel = length - n;
35
36        while (travel-- > 0) {
37            prev = temp;
38            temp = temp.next;
39        }
40
41        prev.next = temp.next;
42
43        return head;
44    }
45}