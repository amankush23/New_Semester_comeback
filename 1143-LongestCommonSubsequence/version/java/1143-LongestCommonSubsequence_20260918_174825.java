// Last updated: 18/09/2026, 17:48:25
1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        int[][] dp = new int[text1.length()+1][text2.length()+1];
4        for(int[] a:dp){
5            Arrays.fill(a, -1);
6        }
7        return LCS(text1, text2, 0,0, dp);
8    }
9    public int LCS(String text1, String text2, int i, int j,int[][] dp){
10        if(i == text1.length() || j == text2.length()){
11            return 0;
12        }
13        if(dp[i][j] != -1 ){
14            return dp[i][j];
15        }
16        int ans = 0;
17        if(text1.charAt(i) == text2.charAt(j)){
18            ans = 1+LCS(text1, text2, i+1, j+1, dp);
19        }
20        else{
21            int f = LCS(text1, text2, i+1, j,dp);
22            int s = LCS(text1, text2, i, j+1,dp);
23            ans=Math.max(f, s);
24        }
25        return dp[i][j] = ans;
26    }
27}