// Last updated: 09/02/2026, 11:33:48
1class Solution {
2    public int coinChange(int[] coins, int amount) {
3        int[][] dp = new int[coins.length][amount+1];
4        for(int[] a: dp) Arrays.fill(a, -1);
5        int ans = coin(coins, amount,0,dp);
6        if(ans >= (int) 1e9){
7            return -1;
8        }
9        else{
10            return ans;
11        }
12
13    }
14    public int coin(int[] coins, int amount, int i,int[][] dp){
15        if(amount == 0) return 0;
16        if(i == coins.length || amount <0){
17            return (int) 1e9;
18        } 
19        if(dp[i][amount] != -1) return dp[i][amount];
20        int inc = 0, exc=0;
21        inc = 1+coin(coins ,amount-coins[i],i,dp);
22        exc =coin(coins, amount, i+1,dp);
23        return dp[i][amount]=Math.min(inc, exc);
24
25    }
26}