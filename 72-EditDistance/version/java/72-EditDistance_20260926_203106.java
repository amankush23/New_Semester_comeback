// Last updated: 26/09/2026, 20:31:06
1class Solution {
2    public int minDistance(String word1, String word2) {
3        int m = word1.length();
4        int n = word2.length();
5        int[][] dp = new int[m+1][n+1];
6        for(int[] a : dp){
7            Arrays.fill(a, -1);
8        }
9        return solve(word1, word2, m, n, dp);
10    }
11    public int solve(String s1, String s2, int m, int n, int[][] dp){
12        if(m == 0) return n;
13        if(n == 0) return m;
14        if(dp[m][n] != -1) return dp[m][n];
15        if(s1.charAt(m-1) == s2.charAt(n-1)){
16            return dp[m][n] =solve(s1, s2, m-1, n-1,dp);
17        }
18        return dp[m][n]= 1+ Math.min(Math.min(solve(s1, s2, m, n-1,dp), solve(s1, s2, m-1, n,dp)), solve(s1, s2, m-1, n-1,dp));
19    }
20}