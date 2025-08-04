// Last updated: 8/4/2025, 11:12:21 PM
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Use a sliding window of at most size k
        for (int i = 0; i < nums.length; i++) {
            // Compare with elements in the window range (up to k elements behind)
            for (int j = Math.max(0, i - k); j < i; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
