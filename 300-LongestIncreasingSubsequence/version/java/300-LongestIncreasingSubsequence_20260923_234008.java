// Last updated: 23/09/2026, 23:40:08
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        int n = nums.length;
4        int[] dp = new int[n];
5        dp[0] = 1;
6        for(int i = 1; i < n ;i++){
7            dp[i] = 1;
8            for(int j = 0;  j < i ; j++){
9                if(nums[j] < nums[i] && dp[i] < dp[j] +1){
10                    dp[i] = dp[j]+1;
11                }
12            }
13        }
14        return Arrays.stream(dp).max().getAsInt();
15    }
16}