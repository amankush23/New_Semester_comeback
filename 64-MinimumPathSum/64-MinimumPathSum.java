// Last updated: 1/3/2026, 3:13:31 PM
1class Solution {
2    public int minPathSum(int[][] grid) {
3        int N = grid.length;
4        int M = grid[0].length;
5        int[][] dp = new int[N][M];
6        dp[0][0] = grid[0][0];
7        for(int i = 1; i < N; i++){
8            dp[i][0] = dp[i-1][0] + grid[i][0];
9        }
10        for(int j = 1; j < M; j++){
11            dp[0][j] = dp[0][j-1] + grid[0][j];
12        }
13        for(int i = 1; i < N; i++){
14            for(int j = 1; j < M; j++){
15                dp[i][j] = grid[i][j] + Math.min(dp[i-1][j], dp[i][j-1]);
16            }
17        }
18        return dp[N-1][M-1];
19    }
20}
21