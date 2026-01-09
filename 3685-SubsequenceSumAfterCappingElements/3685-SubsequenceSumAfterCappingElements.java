// Last updated: 1/9/2026, 11:00:17 PM
1
2class Solution {
3    static final int MAX_K = 4001;
4    boolean[] dp = new boolean[MAX_K];
5
6    public boolean[] subsequenceSumAfterCapping(int[] nums, int k) {
7        Arrays.sort(nums);
8        int n = nums.length;
9
10        Arrays.fill(dp, false);
11        dp[0] = true;
12
13        int p = 0;
14
15        boolean[] ans = new boolean[n];
16
17        for (int i = 1; i <= n; i++) {
18            while (p < n && nums[p] < i) {
19                for (int j = k; j >= nums[p]; j--) {
20                    dp[j] |= dp[j - nums[p]];
21                }
22                p++;
23            }
24
25            int cnt = n - p;
26
27            for (int j = 0; j <= cnt; j++) {
28                int weight = i * j;
29
30                if (k < weight) break;
31                if (dp[k - weight]) {
32                    ans[i - 1] = true;
33                    break;
34                }
35            }
36        }
37
38        return ans;
39    }
40}