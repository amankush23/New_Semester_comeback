// Last updated: 1/5/2026, 10:40:02 PM
1class Solution {
2    public List<Integer> largestDivisibleSubset(int[] nums) {
3
4        int n = nums.length;
5        Arrays.sort(nums);
6
7        int[] dp = new int[n];
8        int[] parent = new int[n];
9
10        Arrays.fill(dp, 1);
11        Arrays.fill(parent, -1);
12
13        int maxLen = 1, last = 0;
14
15        for (int i = 0; i < n; i++) {
16            for (int j = 0; j < i; j++) {
17
18                if (nums[i] % nums[j] == 0) {
19                    if (dp[j] + 1 > dp[i]) {
20                        dp[i] = dp[j] + 1;
21                        parent[i] = j;
22                    }
23                }
24
25            }
26
27            if (dp[i] > maxLen) {
28                maxLen = dp[i];
29                last = i;
30            }
31        }
32
33        List<Integer> ans = new ArrayList<>();
34        while (last != -1) {
35            ans.add(nums[last]);
36            last = parent[last];
37        }
38
39        Collections.reverse(ans);
40        return ans;
41    }
42}
43