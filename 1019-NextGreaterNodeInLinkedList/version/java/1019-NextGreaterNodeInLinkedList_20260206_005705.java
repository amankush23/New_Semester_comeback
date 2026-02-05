// Last updated: 06/02/2026, 00:57:05
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
12    public int[] nextLargerNodes(ListNode head) {
13        ArrayList<Integer> ll = new ArrayList<>();
14        ListNode temp = head;
15        while(temp!= null){
16            ll.add(temp.val);
17            temp = temp.next;
18        }
19        Stack<Integer> st = new Stack<>();
20        int[] ans = new int[ll.size()];
21        for(int i = 0; i < ll.size(); i++){
22
23            while(!st.isEmpty() && ll.get(i) > ll.get(st.peek())){
24                ans[st.pop()] = ll.get(i);
25            }
26            st.push(i);
27        }
28        return ans;
29
30    }
31}