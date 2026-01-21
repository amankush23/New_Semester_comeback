// Last updated: 21/01/2026, 11:57:53
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxSum = 0;
        int n = nums.length;
        for (int i = 0; i < n / 2; i++) {
            maxSum = Math.max(maxSum, nums[i] + nums[n - 1 - i]);
        }
        return maxSum;
    }
}