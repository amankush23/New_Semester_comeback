// Last updated: 12/30/2025, 7:54:23 PM
1class Solution {
2    public int findMin(int[] nums) {
3        return Arrays.stream(nums).min().getAsInt();
4    }
5}