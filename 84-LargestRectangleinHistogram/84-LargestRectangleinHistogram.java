// Last updated: 12/23/2025, 11:32:47 AM
1class Solution {
2    public int largestRectangleArea(int[] heights) {
3        return Area(heights);
4    }
5    public static int Area(int[] arr) {
6		Stack<Integer> st = new Stack<>();
7		int ans = 0;
8		for (int i = 0; i < arr.length; i++) {
9			while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
10				int h = arr[st.pop()];
11				int r = i;
12				if (!st.isEmpty()) {
13					int l = st.peek();
14					ans = Math.max(ans, h * (r - l - 1));
15				} else {
16					ans = Math.max(ans, h * r);
17				}
18			}
19
20			st.push(i);
21		}
22		int r = arr.length;
23		while (!st.isEmpty()) {
24			int h = arr[st.pop()];
25			if (!st.isEmpty()) {
26				int l = st.peek();
27				ans = Math.max(ans, h * (r - l - 1));
28			} else {
29				ans = Math.max(ans, h * r);
30			}
31		}
32		return ans;
33	}
34}