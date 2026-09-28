// Last updated: 28/09/2026, 22:55:48
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
11
12class Solution {
13
14    public void reorderList(ListNode head) {
15        ListNode midNode = findMiddleNode(head);
16        ListNode nextToMid = midNode.next;
17        midNode.next = null;
18
19        ListNode p1 = head;
20        ListNode p2 = reverseList(nextToMid);
21        ListNode p1Next;
22
23        while (p1 != null && p2 != null) {
24            p1Next = p1.next;
25            p1.next = p2;
26            p1 = p2;
27            p2 = p1Next;
28        }
29    }
30
31    public ListNode findMiddleNode(ListNode head) {
32        ListNode fast = head, slow = head;
33
34        while (fast.next != null && fast.next.next != null) {
35            fast = fast.next.next;
36            slow = slow.next;
37        }
38
39        return slow;
40    }
41
42    private ListNode reverseList(ListNode head) {
43        ListNode prev = null;
44        ListNode curr = head;
45
46        while (curr != null) {
47            ListNode next = curr.next;
48            curr.next = prev;
49            prev = curr;
50            curr = next;
51        }
52
53        return prev;
54    }
55}