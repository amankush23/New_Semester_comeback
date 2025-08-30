// Last updated: 8/30/2025, 11:55:34 PM
class Solution {
    public int balancedStringSplit(String s) {
        int balance = 0;
        int ans = 0;

        for (char c : s.toCharArray()) {
            if (c == 'L') {
                balance++;
            } else {
                balance--;
            }
            if (balance == 0) {
                ans++;
            }

        }

        return ans;
    }
}