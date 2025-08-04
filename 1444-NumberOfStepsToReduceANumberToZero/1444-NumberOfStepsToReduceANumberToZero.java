// Last updated: 8/4/2025, 11:10:41 PM
class Solution {
    public int numberOfSteps(int num) {
        int ans = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            ans += 1;
        }
        return ans;
    }
}