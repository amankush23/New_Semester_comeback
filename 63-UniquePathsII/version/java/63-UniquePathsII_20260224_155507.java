// Last updated: 24/02/2026, 15:55:07
1/* class Solution {
2    int cnt = 0;
3    public int uniquePathsWithObstacles(int[][] grid) {
4        // if(grid == null || grid[0][0] == 1) return 1;
5        // int m = grid.length;
6        // int n = grid[0].length;
7        // int[] dp = new int[n];
8        // dp[0] = 1;
9        // for(int i = 0; i < m; i++){
10        //     for(int j = 0; j < n ; j++){
11        //         if(grid[i][j] == 1) 
12        //         dp[j] = 0;
13        //         else{
14        //             if(j > 0){
15        //                 dp[j] += dp[j-1];
16        //             }
17        //         }
18        //     }
19        // }
20        // return dp[n-1];
21        cnt =0;
22        int m = grid.length;
23        int n = grid[0].len
24        int[][] dp = 
25        solve(grid, 0, 0);
26        return cnt;
27    }
28    public void solve(int[][] grid, int i, int j){
29        if(i >= grid.length || j >= grid[0].length || grid[i][j] == 1 ) return;
30
31        if( i == grid.length-1 && j == grid[0].length-1 && grid[i][j] != 1){ 
32            cnt += 1;
33            return; 
34        
35        }
36    solve(grid, i+1, j);
37    solve(grid, i, j+1);
38
39    }
40
41} */
42
43
44
45
46class Solution {
47     
48    public int uniquePathsWithObstacles(int[][] grid) {
49        // if(grid == null || grid[0][0] == 1) return 1;
50        // int m = grid.length;
51        // int n = grid[0].length;
52        // int[] dp = new int[n];
53        // dp[0] = 1;
54        // for(int i = 0; i < m; i++){
55        //     for(int j = 0; j < n ; j++){
56        //         if(grid[i][j] == 1) 
57        //         dp[j] = 0;
58        //         else{
59        //             if(j > 0){
60        //                 dp[j] += dp[j-1];
61        //             }
62        //         }
63        //     }
64        // }
65        // return dp[n-1];
66         
67        int m = grid.length;
68        int n = grid[0].length;
69        // int[][] dp = 
70        int[][] dp = new int[m][n];
71        for(int[] a : dp) Arrays.fill(a, -1);
72        return solve(grid, 0, 0,dp);
73    }
74    public int solve(int[][] grid, int i, int j, int[][] dp){
75        if(i >= grid.length || j >= grid[0].length || grid[i][j] == 1 ) return 0;
76
77        if( i == grid.length-1 && j == grid[0].length-1 && grid[i][j] != 1){ 
78            
79            return 1; 
80        
81        }
82        if(dp[i][j] != -1) return dp[i][j];
83    int l =solve(grid, i+1, j,dp);
84    int r = solve(grid, i, j+1,dp);
85    return dp[i][j] = l+r;
86    }
87
88}