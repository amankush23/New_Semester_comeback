// Last updated: 06/02/2026, 12:52:44
1class Solution {
2    public int maxSumMinProduct(int[] n) {
3        int a = n.length;
4       
5        Stack<Integer> st = new Stack<>();
6        long[] dp = new long[a+1];
7        long res = 0;
8        for(int i =0 ; i< a; i++){
9            dp[i+1] = dp[i]+n[i];
10        }
11        for(int i = 0 ; i <= a; i++ ){
12            while(!st.isEmpty() && (i == a || n[st.peek()] > n[i])){
13                int j = st.pop();
14                res = Math.max(res, (dp[i]-dp[st.isEmpty() ? 0 : st.peek()+1])*n[j]);
15            }
16            st.push(i);
17        }
18        return (int)(res%1000000007);
19    }
20}