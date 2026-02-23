// Last updated: 23/02/2026, 21:50:08
1class Solution {
2    public int rob(int[] nums) {
3        int[] dp = new int[nums.length];
4        Arrays.fill(dp, -1);
5        return solve(nums, 0,dp);
6    }
7    public int solve(int[] nums, int i, int[] dp){
8        if(i >= nums.length) return 0;
9        if(dp[i] != -1) return dp[i];
10        int inc = 0, exc = 0;
11        inc = nums[i] +solve(nums, i+2,dp);
12        exc = solve(nums, i+1,dp);
13        return dp[i] = Math.max(inc, exc);
14    }
15}