// Last updated: 26/02/2026, 01:16:15
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
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        ListNode dummy = new ListNode(0);
14        dummy.next = head;
15        ListNode slow = dummy;
16        ListNode fast = dummy;
17        for(int i = 0; i < n ;i++){
18            fast = fast.next;
19        }
20        while(fast.next != null){
21            slow = slow.next;
22            fast = fast.next;
23        }
24        slow.next = slow.next.next;
25        return dummy.next;
26    }
27}