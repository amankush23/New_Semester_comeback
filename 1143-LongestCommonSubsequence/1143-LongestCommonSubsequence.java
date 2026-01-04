// Last updated: 1/4/2026, 11:12:48 AM
1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        int[][] dp = new int[text1.length()][text2.length()];
4        for(int[] arr : dp) Arrays.fill(arr, -1);
5        return LCS(text1, text2, 0,0,dp);
6    }
7    public int LCS(String text1, String text2, int i, int j,int[][] dp){
8        if(i == text1.length() || j == text2.length()){
9            return 0;
10        }
11        if(dp[i][j] != -1){
12            return dp[i][j];
13        }
14        
15        int ans = 0;
16        if(text1.charAt(i) == text2.charAt(j)){
17            ans = 1+LCS(text1, text2, i+1, j+1,dp);
18        }
19        else{
20            int f = LCS(text1, text2, i+1, j,dp);
21            int s = LCS(text1, text2, i, j+1,dp);
22            ans=Math.max(f, s);
23        }
24        return dp[i][j]=ans;
25        
26    }
27}