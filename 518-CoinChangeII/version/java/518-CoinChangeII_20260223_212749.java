// Last updated: 23/02/2026, 21:27:49
1class Solution {
2    public int change(int amount, int[] coins) {
3        int[][] dp = new int[amount+1][coins.length];
4        for(int[] a : dp ) Arrays.fill(a, -1);
5        return solve(amount, coins, 0, dp);
6    }
7    public int solve(int amount, int[] coins, int i, int[][] dp){
8        if(amount == 0) return 1;
9        if(coins.length == i || amount < 0) return 0;
10        if(dp[amount][i] != -1) return dp[amount][i];
11        int inc = 0, exc = 0;
12        if(amount >= coins[i]){
13            inc = solve(amount- coins[i], coins, i , dp);
14        }
15        exc = solve(amount, coins, i+1, dp);
16        return dp[amount][i] = inc+exc;
17    }
18}