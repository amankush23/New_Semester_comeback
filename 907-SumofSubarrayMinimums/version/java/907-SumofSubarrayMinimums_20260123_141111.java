// Last updated: 23/01/2026, 14:11:11
1class Solution {
2    public int sumSubarrayMins(int[] arr) {
3        int n = arr.length;
4        int MOD = 1_000_000_007;
5        int[] left = new int[n];
6        int[] right = new int[n];
7        Stack<Integer> st = new Stack<>();
8        for(int i = 0; i< n; i++){
9            while(!st.isEmpty() && arr[st.peek()]> arr[i]){
10                st.pop();
11            }
12            left[i] = st.isEmpty() ? i+1 : i-st.peek();
13            st.push(i);
14
15        }
16        st.clear();
17        for (int i = n - 1; i >= 0; i--) {
18            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
19                st.pop();
20            }
21            right[i] = st.isEmpty() ? n - i : st.peek() - i;
22            st.push(i);
23        }
24        long ans = 0;
25        for (int i = 0; i < n; i++) {
26            ans = (ans + (long) arr[i] * left[i] * right[i]) % MOD;
27        }
28
29        return (int) ans;
30        /*
31        int sum = 0;
32        for (int i = 0; i < n; i++) {
33            int min = arr[i];
34            for (int j = i; j < n; j++) {
35                min = Math.min(min, arr[j]);
36                sum += min;
37            }
38        }
39        return sum;
40        */
41
42    }
43}