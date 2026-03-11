// Last updated: 11/03/2026, 14:43:36
1class Solution {
2    public int maxSubArray(int[] nums) {
3        //int max = Integer.MIN_VALUE;
4        int n = nums.length;
5        int[] prefix = new int[n];
6        prefix[0] = nums[0];
7        for(int i = 1; i < n; i++){
8            prefix[i] = prefix[i-1] + nums[i];
9        } 
10        int max = prefix[0];
11        int minPrefix = 0;
12
13        for(int i = 0; i < n; i++){
14            max = Math.max(max, prefix[i] - minPrefix);
15            minPrefix = Math.min(minPrefix, prefix[i]);
16        }
17
18        return max;
19    }
20}