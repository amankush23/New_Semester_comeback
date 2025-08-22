// Last updated: 8/22/2025, 4:27:56 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        int totalSum = Arrays.stream(nums).sum();
        return totalSum % k;
    }
}