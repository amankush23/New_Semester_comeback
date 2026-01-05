// Last updated: 1/5/2026, 9:42:03 PM
1class Solution {
2    public int rob(int[] nums) {
3        int[] dp =  new int[nums.length];
4        Arrays.fill(dp, -1);
5        return house(nums, 0, dp);
6    }
7    public static int house(int[] arr, int i , int[] dp){
8        if(i >= arr.length){
9            return 0;
10        }
11        if(dp[i] != -1) return dp[i];
12        int rob = arr[i] + house(arr, i+2, dp);
13        int dont_rob = house(arr, i+1, dp);
14        return dp[i] = Math.max(rob, dont_rob);
15    }
16}