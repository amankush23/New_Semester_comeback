// Last updated: 10/20/2025, 3:54:00 PM
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2];
        for (int i = 0; i < n; i++) Arrays.fill(dp[i], -1);
        return f(0, 1, prices, dp);
    }
    public int f(int i, int j, int[] prices, int[][] dp) {
        if (i >= prices.length) return 0;
        if (dp[i][j] != -1) return dp[i][j];

        if (j == 1) {
            dp[i][j] = Math.max(-prices[i] + f(i + 1, 0, prices, dp),f(i + 1, 1, prices, dp));
        } else {
            dp[i][j] = Math.max(prices[i] + f(i + 2, 1, prices, dp), f(i + 1, 0, prices, dp));
        }
        return dp[i][j];
    }
}