// Last updated: 23/09/2026, 16:05:26
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n = nums.length;
4        int[] left = new int[nums.length];
5        int[] right = new int[nums.length];
6        left[0] = 1;
7        right[n-1] = 1;
8        for(int i = 1; i < nums.length; i++){
9            left[i] = left[i-1] * nums[i-1];
10        }
11        for(int i = n-2; i >= 0; i--){
12            right[i] = right[i+1] * nums[i+1];
13        }
14        for(int i = 0; i < n; i++){
15            left[i] = left[i] * right[i];
16        }
17        return left;
18
19    }
20}