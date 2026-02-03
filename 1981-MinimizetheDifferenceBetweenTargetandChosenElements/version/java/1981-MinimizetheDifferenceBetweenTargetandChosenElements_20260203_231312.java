// Last updated: 03/02/2026, 23:13:12
1class Solution {
2    public int minimizeTheDifference(int[][] mat, int target) {
3        int n = mat.length;
4        int m = mat[0].length;
5        int[][] dp = new int[n][5000];
6        for(int i=0; i<m; i++){
7            dp[0][mat[0][i]] = 1;
8        }
9
10        for(int i=1; i<n; i++){
11            for(int s=0; s<5000; s++){
12                for(int j=0; j<m; j++){
13                if(s >= mat[i][j] && dp[i][s] == 0){
14                    dp[i][s] = dp[i-1][s-mat[i][j]];
15                }
16            }
17            }
18           
19        }
20         int min = Integer.MAX_VALUE;
21         if(dp[n-1][target] == 1) return 0;
22        for(int i=0; i<5000; i++){
23            if(dp[n-1][i] == 1)
24            min = Math.min(min, (int)Math.abs(target - i));
25        }
26
27        return min;
28    }
29}