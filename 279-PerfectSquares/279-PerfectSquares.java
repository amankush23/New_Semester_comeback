// Last updated: 12/2/2025, 10:31:14 PM
1class Solution {
2    public int numSquares(int n) {
3        int[] dp = new int[n + 1];
4        Arrays.fill(dp, Integer.MAX_VALUE);
5        dp[0] = 0;
6        int count = 1;
7        while (count * count <= n) {
8            int sq = count * count;
9            for (int i = sq; i <= n; i++) {
10                dp[i] = Math.min(dp[i - sq] + 1, dp[i]);
11            }
12            count++;
13        }
14        return dp[n];
15    }
16}