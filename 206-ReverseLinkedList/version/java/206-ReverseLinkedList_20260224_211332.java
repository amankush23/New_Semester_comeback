// Last updated: 24/02/2026, 21:13:32
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
12    public ListNode reverseList(ListNode head) {
13        ListNode curr = head;
14        ListNode prev = null;
15        while(curr != null){
16            ListNode ahead = curr.next;
17            curr.next = prev;
18            prev = curr;
19            curr = ahead;
20        }
21        return prev;
22    }
23}