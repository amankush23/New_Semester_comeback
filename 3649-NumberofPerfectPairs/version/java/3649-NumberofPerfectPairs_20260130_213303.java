// Last updated: 30/01/2026, 21:33:03
1import java.util.Arrays;
2
3class Solution {
4    public long perfectPairs(int[] nums) {
5        int[] lst = nums.clone();
6        int n = nums.length;
7        long ginti = 0;
8
9        long[] absNums = new long[n];
10        for (int i = 0; i < n; i++) absNums[i] = Math.abs(nums[i]);
11        Arrays.sort(absNums);
12
13        int j = 0;
14        for (int i = 0; i < n; i++) {
15            long a = absNums[i];
16            j = Math.max(j, i + 1);
17            while (j < n && absNums[j] <= 2 * a) j++;
18            ginti += (j - i - 1);
19        }
20
21        return ginti;
22    }
23}
24