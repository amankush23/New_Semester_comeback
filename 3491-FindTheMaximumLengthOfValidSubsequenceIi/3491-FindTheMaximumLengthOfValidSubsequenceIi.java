// Last updated: 21/01/2026, 11:56:13
class Solution {
    public int maximumLength(int[] nums, int k) {
        int n = nums.length;
        int[][] dp = new int[k][n];
        for(int[] a : dp){
            Arrays.fill(a,1);
        }

        int ans = 1;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<i; j++){
                int mod = (nums[i]+nums[j])%k;
                dp[mod][i] = Math.max(dp[mod][i],dp[mod][j]+1);
                ans = Math.max(ans,dp[mod][i]);
            }
        }
        return ans;
    }
}