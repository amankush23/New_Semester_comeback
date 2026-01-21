// Last updated: 21/01/2026, 11:58:23
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            result[index++] = nums[i];     // take from first half
            result[index++] = nums[n + i]; // take from second half
        }

        return result;
    }
}
