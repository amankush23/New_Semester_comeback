// Last updated: 21/07/2026, 00:45:22
1class Solution {
2    public int[] dailyTemperatures(int[] temperatures) {
3        int n = temperatures.length;
4        int[] arr = new int[n];
5        Stack<Integer> st = new Stack<>();
6        for(int i =0; i < n; i++){
7
8            while(!st.isEmpty() && temperatures[st.peek()] < temperatures[i] ){
9                arr[st.peek()] = i - st.pop();
10            }
11            st.push(i);
12        }
13        return arr;
14    }
15}
16