// Last updated: 8/4/2025, 11:13:17 PM
class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n; // Base cases: f(1) = 1, f(2) = 2

        int first = 1, second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }

        return second;
    }
}
