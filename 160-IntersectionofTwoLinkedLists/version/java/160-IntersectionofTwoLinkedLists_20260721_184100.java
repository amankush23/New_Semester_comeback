// Last updated: 21/07/2026, 18:41:00
1public class Solution {
2    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
3        ListNode a = headA;
4        ListNode b = headB;
5        while(a!=b){
6            if(a == null){
7                a = headB;
8
9            }
10            else{
11                a = a.next;
12            }
13            if(b == null){
14                b = headA;
15            }
16            else{
17                b = b.next;
18            }
19        }
20        return a;
21    }
22}