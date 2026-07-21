// Last updated: 21/07/2026, 21:40:40
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode detectCycle(ListNode head) {
14        ListNode slow = head;
15        ListNode fast = head;
16        while(fast != null && fast.next != null){
17            slow = slow.next;
18            fast = fast.next.next;
19            if(slow == fast){
20                ListNode ptr = head;
21
22                while (ptr != slow) {
23                    ptr = ptr.next;
24                    slow = slow.next;
25                }
26
27                return ptr;
28            }
29        }
30        return null;
31    }
32}