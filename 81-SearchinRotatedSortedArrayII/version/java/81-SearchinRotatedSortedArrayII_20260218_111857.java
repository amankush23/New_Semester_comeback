// Last updated: 18/02/2026, 11:18:57
1class Solution {
2    public boolean search(int[] nums, int target) {
3        for(int i = 0; i < nums.length;i++){
4            if(nums[i] == target) return true;
5        }
6        return false;
7    }
8}