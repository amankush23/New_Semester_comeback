// Last updated: 21/07/2026, 10:06:34
1class Solution {
2    public int findMin(int[] nums) {
3        return Arrays.stream(nums).min().getAsInt();
4    }
5}
6