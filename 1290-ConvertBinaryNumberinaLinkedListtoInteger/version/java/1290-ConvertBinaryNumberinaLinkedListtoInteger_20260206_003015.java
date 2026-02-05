// Last updated: 06/02/2026, 00:30:15
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
12    public int getDecimalValue(ListNode head) {
13        int cnt = 1;
14        int num = 0;
15        ListNode curr = head;
16        while(curr != null){
17            curr = curr.next;
18            cnt *= 2;
19        }
20        cnt /= 2;
21        curr = head;
22        while(curr != null){
23            num+= curr.val * cnt;
24            cnt /= 2;
25            curr=curr.next;
26        }
27
28        return num; // Return the final decimal number
29    }
30}