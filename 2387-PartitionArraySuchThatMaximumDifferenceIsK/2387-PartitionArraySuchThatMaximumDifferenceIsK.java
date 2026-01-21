// Last updated: 21/01/2026, 11:57:14
class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 1;
        int min = nums[0];
        for (int i = 1;  i < nums.length; i++) {
            if (nums[i] - min > k) {
                ans++;
                min = nums[i];
            }
        }
        return ans;
    }
}