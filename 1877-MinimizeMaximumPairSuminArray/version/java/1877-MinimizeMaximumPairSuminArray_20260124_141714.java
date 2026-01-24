// Last updated: 24/01/2026, 14:17:14
1class Solution {
2    public int minPairSum(int[] nums) {
3        Arrays.sort(nums);
4        int max = 0;
5        int n = nums.length;
6        for(int i = 0 ; i < n/2; i++){
7            max = Math.max(max, nums[i]+nums[n-1-i]);
8        }
9        return max;
10    }
11}