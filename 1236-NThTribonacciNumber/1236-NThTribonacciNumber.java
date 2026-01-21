// Last updated: 21/01/2026, 11:59:04
class Solution {
    public int tribonacci(int n) {
        int[] dp = new int[n+1];
            Arrays.fill(dp, -1);
            return tbn(n , dp);
    }
    public static int tbn(int n, int[] dp){
        if(n == 0){
            return 0;
        }
        if( n == 1 || n == 2){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int t1 = tbn(n-1,dp);
        int t2 = tbn(n-2,dp);
        int t3 = tbn(n-3,dp);
        return dp[n]=t1+t2+t3;
    }
}