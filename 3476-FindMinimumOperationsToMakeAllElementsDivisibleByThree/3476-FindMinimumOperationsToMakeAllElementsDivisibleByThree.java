// Last updated: 8/4/2025, 11:09:06 PM
class Solution {
    public int minimumOperations(int[] nums) {
        return KamOperation(nums);
    }
    public static int KamOperation(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] % 3 != 0) {
                if (nums[i] % 3 == 1) {
                    nums[i]--;  // Subtract 1
                } else {
                    nums[i]++;  // Add 1
                }
                temp++;  // Count the operation
            }
        }
        return temp;
    }
}