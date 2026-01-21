// Last updated: 21/01/2026, 11:55:56
class Solution {
    public int minOperations(int[] nums, int k) {
        int totalSum = Arrays.stream(nums).sum();
        return totalSum % k;
    }
}