// Last updated: 1/6/2026, 3:15:24 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int n = prices.length;
4        int[][][] dp = new int[n][2][3];
5        for (int i = 0; i < n; i++)
6            for (int j = 0; j < 2; j++)
7                Arrays.fill(dp[i][j], -1);
8
9        return solve(prices, 0, 1, 2, dp);
10    }
11
12    public int solve(int[] prices, int i, int buy, int cap, int[][][] dp) {
13        if (i == prices.length || cap == 0)
14            return 0;
15
16        if (dp[i][buy][cap] != -1)
17            return dp[i][buy][cap];
18
19        int profit;
20        if (buy == 1) {
21            profit = Math.max(-prices[i] + solve(prices, i + 1, 0, cap, dp),solve(prices, i + 1, 1, cap, dp));
22        } else {
23            profit = Math.max(prices[i] + solve(prices, i + 1, 1, cap - 1, dp),solve(prices, i + 1, 0, cap, dp));
24        }
25
26        return dp[i][buy][cap] = profit;
27    }
28}
29