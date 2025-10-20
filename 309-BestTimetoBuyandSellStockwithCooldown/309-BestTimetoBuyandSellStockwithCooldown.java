// Last updated: 10/20/2025, 3:52:05 PM
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2];
        for (int i = 0; i < n; i++) Arrays.fill(dp[i], -1);
        return f(0, 1, prices, dp);
    }
    public int f(int ind, int buy, int[] prices, int[][] dp) {
        if (ind >= prices.length) return 0;
        if (dp[ind][buy] != -1) return dp[ind][buy];

        if (buy == 1) {
            dp[ind][buy] = Math.max(
                -prices[ind] + f(ind + 1, 0, prices, dp),f(ind + 1, 1, prices, dp));
        } else {
            dp[ind][buy] = Math.max(
                prices[ind] + f(ind + 2, 1, prices, dp), f(ind + 1, 0, prices, dp));
        }
        return dp[ind][buy];
    }
}