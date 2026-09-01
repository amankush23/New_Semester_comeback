// Last updated: 01/09/2026, 12:39:28
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
13        // ListNode curr = head;
14        // ListNode prev = null;
15
16        // while(curr != null){
17        //     ListNode nextNode = curr.next;
18        //     curr.next = prev;
19        //     prev = curr;
20        //     curr = nextNode;
21        // }
22        // return prev;
23        if(head == null || head.next == null){
24            return head;
25        }
26        ListNode ans = reverseList(head.next);
27        head.next.next = head;
28        head.next = null;
29        return ans;
30    }
31}