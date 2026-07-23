// Last updated: 23/07/2026, 15:15:12
1class Solution {
2    public int missingNumber(int[] nums) {
3        int n = nums.length;
4        int sum1 = n*(n+1)/2;
5        int sum2 =0;
6        for(int i : nums){
7            sum2 += i;
8        }
9        return sum1-sum2;
10    }
11}