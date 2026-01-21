// Last updated: 21/01/2026, 11:55:48
class Solution {
    public int minSensors(int n, int m, int k) {
        int a = (n + 2 * k) / (2 * k + 1);
        int b = (m + 2 * k) / (2 * k + 1);
        return a * b;
    }
}