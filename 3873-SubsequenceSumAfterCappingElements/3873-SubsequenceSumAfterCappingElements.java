// Last updated: 21/01/2026, 11:55:51

class Solution {
    static final int MAX_K = 4001;
    boolean[] dp = new boolean[MAX_K];

    public boolean[] subsequenceSumAfterCapping(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;

        Arrays.fill(dp, false);
        dp[0] = true;

        int p = 0;

        boolean[] ans = new boolean[n];

        for (int i = 1; i <= n; i++) {
            while (p < n && nums[p] < i) {
                for (int j = k; j >= nums[p]; j--) {
                    dp[j] |= dp[j - nums[p]];
                }
                p++;
            }

            int cnt = n - p;

            for (int j = 0; j <= cnt; j++) {
                int weight = i * j;

                if (k < weight) break;
                if (dp[k - weight]) {
                    ans[i - 1] = true;
                    break;
                }
            }
        }

        return ans;
    }
}