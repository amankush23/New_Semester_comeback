// Last updated: 8/4/2025, 11:10:26 PM
class Solution {
    public int countGoodTriplets(int[] nums, int a, int b, int c) {
        
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (Math.abs(nums[i] - nums[j]) <= a &&
                        Math.abs(nums[j] - nums[k]) <= b &&
                        Math.abs(nums[k] - nums[i]) <= c) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
