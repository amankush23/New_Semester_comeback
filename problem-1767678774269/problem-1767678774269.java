// Last updated: 1/6/2026, 11:22:54 AM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int n = prices.length;
4        int[][] dp = new int[n][2];
5        for (int i = 0; i < n; i++) Arrays.fill(dp[i], -1);
6        return f(0, 1, prices, dp);
7    }
8    public int f(int i, int j, int[] prices, int[][] dp) {
9        if (i >= prices.length) return 0;
10        if (dp[i][j] != -1) return dp[i][j];
11
12        if (j == 1) {
13            dp[i][j] = Math.max(-prices[i] + f(i + 1, 0, prices, dp),f(i + 1, 1, prices, dp));
14        } else {
15            dp[i][j] = Math.max(prices[i] + f(i + 2, 1, prices, dp), f(i + 1, 0, prices, dp));
16        }
17        return dp[i][j];
18    }
19}