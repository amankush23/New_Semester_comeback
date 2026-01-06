// Last updated: 1/6/2026, 11:47:02 AM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int[][] dp = new int[prices.length][2];
4        for(int[] a: dp) Arrays.fill(a, -1);
5        return solve(prices, 0,1, dp);
6    }
7    public int solve(int[] prices, int i, int j, int[][] dp){
8        if(i >= prices.length) return 0;
9        if(dp[i][j]!= -1) return dp[i][j];
10        if(j == 1) dp[i][j] = Math.max(-prices[i]+ solve(prices,i+1, 0,dp), solve(prices, i+1, 1, dp));
11        else dp[i][j] = Math.max(prices[i]+ solve(prices,i+2, 1,dp), solve(prices, i+1, 0, dp));
12        return dp[i][j];
13    }
14}