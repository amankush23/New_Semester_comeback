// Last updated: 21/01/2026, 11:55:44
import java.util.Arrays;

class Solution {
    public long perfectPairs(int[] nums) {
        int[] lst = nums.clone();
        int n = nums.length;
        long ginti = 0;

        long[] absNums = new long[n];
        for (int i = 0; i < n; i++) absNums[i] = Math.abs(nums[i]);
        Arrays.sort(absNums);

        int j = 0;
        for (int i = 0; i < n; i++) {
            long a = absNums[i];
            j = Math.max(j, i + 1);
            while (j < n && absNums[j] <= 2 * a) j++;
            ginti += (j - i - 1);
        }

        return ginti;
    }
}
