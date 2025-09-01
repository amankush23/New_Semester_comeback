// Last updated: 9/2/2025, 12:00:00 AM
class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            int d = 0, x = num;
            while (x > 0) {
                d++;
                x /= 10;
            }
            if (d % 2 == 0) ans++;
        }
        return ans;
    }
}