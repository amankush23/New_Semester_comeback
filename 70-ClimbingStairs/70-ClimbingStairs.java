// Last updated: 1/3/2026, 12:20:53 PM
1class Solution {
2    public int climbStairs(int n) {
3        if (n <= 2) return n; // Base cases: f(1) = 1, f(2) = 2
4
5        int first = 1, second = 2;
6        for (int i = 3; i <= n; i++) {
7            int third = first + second;
8            first = second;
9            second = third;
10        }
11
12        return second;
13    }
14}
15