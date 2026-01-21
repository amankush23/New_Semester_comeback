// Last updated: 21/01/2026, 12:00:36
class Solution {
    public int hammingDistance(int x, int y) {
        int n = x ^ y;
        int set = 0;
        while(n > 0) {
            n = (n & (n-1));
            set++;
        }
        return set;
    }
}