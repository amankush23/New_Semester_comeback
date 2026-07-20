// Last updated: 21/07/2026, 01:32:44
1class Solution {
2    public int largestRectangleArea(int[] heights) {
3        int n = heights.length;
4        int[] right = new int[n];
5        int[] left = new int[n];
6        Stack<Integer> st = new Stack<>();
7
8        for(int i = n-1; i >= 0; i--){
9            while(st.size()>0 && heights[st.peek()] >= heights[i]){
10                st.pop();
11            }
12            right[i] = st.isEmpty() ? n : st.peek();
13            st.push(i);
14        }
15        st.clear();
16        for(int i = 0; i <n ; i++){
17            while(st.size()>0 && heights[st.peek()] >= heights[i]){
18                st.pop();
19            }
20            left[i] = st.isEmpty() ? -1 : st.peek();
21            st.push(i);
22        }
23        int max = Integer.MIN_VALUE;
24        for(int i = 0; i< n ; i++){
25            int width = right[i]-left[i]-1;
26            int area = heights[i] * width;
27            max = Math.max(area, max);
28
29        }
30        return max;
31    }
32}
33