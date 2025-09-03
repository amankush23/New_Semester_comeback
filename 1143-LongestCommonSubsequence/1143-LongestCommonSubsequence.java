// Last updated: 9/3/2025, 11:13:16 PM
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()+1][text2.length()+1];
        for(int[] a:dp){
            Arrays.fill(a, -1);
        }
        return LCS(text1, text2, 0,0, dp);
    }
    public int LCS(String text1, String text2, int i, int j,int[][] dp){
        if(i == text1.length() || j == text2.length()){
            return 0;
        }
        if(dp[i][j] != -1 ){
            return dp[i][j];
        }
        int ans = 0;
        if(text1.charAt(i) == text2.charAt(j)){
            ans = 1+LCS(text1, text2, i+1, j+1, dp);
        }
        else{
            int f = LCS(text1, text2, i+1, j,dp);
            int s = LCS(text1, text2, i, j+1,dp);
            ans=Math.max(f, s);
        }
        return dp[i][j] = ans;
    }
}