// Last updated: 21/01/2026, 11:58:38
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