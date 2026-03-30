// Last updated: 30/03/2026, 20:23:42
1class Solution {
2    public long subArrayRanges(int[] nums) {
3        long sum = 0;
4        int n =nums.length;
5        for(int i = 0; i < n; i++){
6            int max = nums[i];
7            int min = nums[i];
8
9            for(int j = i; j < n; j++){
10                max = Math.max(max, nums[j]);
11                min = Math.min(min, nums[j]);
12                sum += (long) (max - min);
13            }
14        }
15        return sum;
16    }
17}