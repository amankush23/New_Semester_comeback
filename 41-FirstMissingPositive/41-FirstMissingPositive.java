// Last updated: 9/25/2025, 10:23:18 PM
class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[n + 1];
        for (int num : nums) {
            if (num > 0 && num <= n) {
                seen[num] = true;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (!seen[i]) {
                return i;
            }
        }
        return n + 1;
    }
}