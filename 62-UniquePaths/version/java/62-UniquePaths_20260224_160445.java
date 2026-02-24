// Last updated: 24/02/2026, 16:04:45
1class Solution {
2    public int uniquePaths(int m, int n) {
3        // int[][] dp = 
4        int[][] dp = new int[m][n];
5        for(int[] a : dp) Arrays.fill(a, -1);
6        return solve(m,n, 0, 0,dp);
7    }
8    public int solve(int m,int n, int i, int j, int[][] dp){
9        if(i >= m || j >= n ) return 0;
10        if( i == m-1 && j == n-1) return 1; 
11        if(dp[i][j] != -1) return dp[i][j];
12        int l =solve(m, n, i+1, j,dp);
13        int r = solve(m, n, i, j+1,dp);
14        return dp[i][j] = l+r;
15    }
16}