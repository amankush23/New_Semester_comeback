// Last updated: 07/09/2026, 22:35:13
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
12    public ListNode addTwoNumbers(ListNode num1, ListNode num2) {
13        ListNode dummyHead = new ListNode(-1);
14        ListNode curr = dummyHead;
15
16        ListNode temp1 = num1;
17        ListNode temp2 = num2;
18
19        int carry = 0;
20
21        while (temp1 != null || temp2 != null) {
22            int sum = carry;
23
24            if (temp1 != null)
25                sum += temp1.val;
26
27            if (temp2 != null)
28                sum += temp2.val;
29
30            ListNode newNode = new ListNode(sum % 10);
31            carry = sum / 10;
32
33            curr.next = newNode;
34            curr = curr.next;
35
36            if (temp1 != null)
37                temp1 = temp1.next;
38
39            if (temp2 != null)
40                temp2 = temp2.next;
41        }
42
43        if (carry != 0) {
44            curr.next = new ListNode(carry);
45        }
46
47        return dummyHead.next;
48    }
49}