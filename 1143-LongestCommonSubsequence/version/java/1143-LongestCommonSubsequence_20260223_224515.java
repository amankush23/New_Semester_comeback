// Last updated: 23/02/2026, 22:45:15
1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        int[][] dp = new int[text1.length()][text2.length()];
4        for(int[] arr : dp) Arrays.fill(arr, -1);
5        return solve(text1, text2, 0, 0, dp);
6    }
7    public int solve(String text1, String text2, int i, int j, int[][] dp){
8        if(i == text1.length() || j == text2.length()) return 0;
9        int ans = 0;
10        if(text1.charAt(i) == text2.charAt(j)){
11            return dp[i][j] = 1+ solve(text1, text2, i+1, j+1,dp);
12        }
13        if(dp[i][j] != -1) return dp[i][j] ;
14        int y = solve(text1, text2, i+1, j,dp);
15        int z = solve(text1, text2, i, j+1,dp);
16        ans = Math.max(y, z);
17        return dp[i][j] = ans;
18
19    }
20}