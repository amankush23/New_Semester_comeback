// Last updated: 21/01/2026, 11:59:02
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        for(int[] arr : dp) Arrays.fill(arr, -1);
        return LCS(text1, text2, 0,0,dp);
    }
    public int LCS(String text1, String text2, int i, int j,int[][] dp){
        if(i == text1.length() || j == text2.length()){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        
        int ans = 0;
        if(text1.charAt(i) == text2.charAt(j)){
            ans = 1+LCS(text1, text2, i+1, j+1,dp);
        }
        else{
            int f = LCS(text1, text2, i+1, j,dp);
            int s = LCS(text1, text2, i, j+1,dp);
            ans=Math.max(f, s);
        }
        return dp[i][j]=ans;
        
    }
}