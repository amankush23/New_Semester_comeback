// Last updated: 21/01/2026, 12:00:33
class Solution {
    private int[][] dp;

    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        int total = 0;
        for (int x : nums) total += x;

        dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        int p1 = solve(nums, 0, n - 1);
        int p2 = total - p1;

        return p1 >= p2;
    }

    private int solve(int[] nums, int i, int j) {
        if (i > j) return 0;
        if (i == j) return nums[i];
        if (dp[i][j] != -1) return dp[i][j];

        int takeLeft = nums[i] + Math.min(solve(nums, i + 2, j), solve(nums, i + 1, j - 1));
        int takeRight = nums[j] + Math.min(solve(nums, i, j - 2), solve(nums, i + 1, j - 1));

        dp[i][j] = Math.max(takeLeft, takeRight);
        return dp[i][j];
    }
}
