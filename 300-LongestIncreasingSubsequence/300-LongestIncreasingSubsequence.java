// Last updated: 1/2/2026, 11:06:16 PM
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        return LIS(nums);
4    }
5    public static int LIS(int[] arr) {
6		int[] dp = new int[arr.length];
7		Arrays.fill(dp, 1);
8		for (int i = 1; i < dp.length; i++) {
9			for (int j = i - 1; j >= 0; j--) {
10				if (arr[i] > arr[j]) {
11					int x = dp[j];
12					dp[i] = Math.max(dp[i], x + 1);
13				}
14
15			}
16		}
17		return Arrays.stream(dp).max().getAsInt();
18
19	}
20}