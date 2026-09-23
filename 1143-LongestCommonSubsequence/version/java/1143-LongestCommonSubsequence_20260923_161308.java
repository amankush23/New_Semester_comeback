// Last updated: 23/09/2026, 16:13:08
1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        int[][] dp = new int[text1.length()+1][text2.length()+1];
4        for(int[] a: dp){
5            Arrays.fill(a, -1);
6        }
7        int result =LCS(text1, text2, 0, 0, dp);
8        return result;
9    }
10    public int LCS(String s1, String s2, int i, int j, int[][] dp){
11        if(i == s1.length() || j == s2.length()){
12            return 0;
13        }
14        if(dp[i][j] != -1){
15            return dp[i][j];
16        }
17        int ans = 0;
18        if(s1.charAt(i) == s2.charAt(j)){
19            ans = 1 + LCS(s1, s2, i+1 , j+1,dp);
20        }
21        else {
22            int f = LCS(s1, s2, i+1 , j,dp);
23            int s = LCS(s1, s2, i , j+1,dp);
24            ans = Math.max(f, s);
25        }
26        return dp[i][j] = ans;
27    }
28}