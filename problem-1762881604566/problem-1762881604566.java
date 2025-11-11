// Last updated: 11/11/2025, 10:50:04 PM
class Solution {
    public int rob(int[] nums) {
        return robs(nums);
    }
    public int robs(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];

        int[] dp1 = new int[n];
        int[] dp2 = new int[n];

        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);
        int case1 = Robber(nums, 0, n - 1, dp1);
        int case2 = Robber(nums, 1, n, dp2);

        return Math.max(case1, case2);
    }
     public static int Robber(int[] arr, int i, int end, int[] dp) {
        if (i >= end) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        int rob = arr[i] + Robber(arr, i + 2, end, dp);
        int dontRob = Robber(arr, i + 1, end, dp);
        return dp[i] = Math.max(rob, dontRob);
    }
}