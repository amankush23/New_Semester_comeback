// Last updated: 19/07/2026, 00:16:21
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        for(int i = 0; i < nums.length; i++){
4            for(int j = i+1; j < nums.length; j++){
5                if(nums[i]+nums[j] == target){
6                    int[] Array = {i+1, j+1};
7                    return Array;
8                }
9            }
10        }
11        return new int[0];
12    }
13}
14