// Last updated: 09/02/2026, 11:43:30
1class Solution {
2    public int change(int amount, int[] coins) {
3        int[][] dp = new int[amount+1][coins.length];
4        for(int[] a : dp) Arrays.fill(a,-1);
5        return solve(amount, coins, 0,dp);
6    }
7    public int solve(int amount, int[] coins, int i , int[][] dp){
8        if(amount == 0) return 1;
9        if(i == coins.length || amount<0){
10            return 0;
11        }
12         if(dp[amount][i] != -1) return dp[amount][i];
13        int inc=0, exc =0;
14        if(coins[i] <= amount){
15            inc = solve(amount-coins[i],coins,  i,dp);
16        }
17        exc = solve(amount,coins ,  i+1,dp);
18        return dp[amount][i]=inc+exc;
19    }
20}