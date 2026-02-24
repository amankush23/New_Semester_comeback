// Last updated: 24/02/2026, 15:25:29
1class Solution {
2    public int uniquePaths(int m, int n) {
3        int[][] dp = new int[m][n];
4        for (int i = 0; i < m; i++) {
5            dp[i][n-1] = 1;
6        }
7        for (int j = 0; j < n; j++) {
8            dp[m-1][j] = 1;
9        }
10        for (int i = m - 2; i >= 0; i--) {
11            for (int j = n - 2; j >= 0; j--) {
12                dp[i][j] = dp[i+1][j] + dp[i][j+1];
13            }
14        }
15        return dp[0][0];
16    }
17}