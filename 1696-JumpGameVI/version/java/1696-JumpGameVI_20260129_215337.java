// Last updated: 29/01/2026, 21:53:37
1class Solution {
2    public int maxResult(int[] nums, int k) {
3        int n = nums.length, a = 0, b = 0;
4        int[] deq = new int[n];
5        deq[0] = n - 1;
6        for (int i = n - 2; i >= 0; i--) {
7            if (deq[a] - i > k) a++;
8            nums[i] += nums[deq[a]];
9            while (b >= a && nums[deq[b]] <= nums[i]) b--;
10            deq[++b] = i;
11        }
12        return nums[0];
13    }
14}