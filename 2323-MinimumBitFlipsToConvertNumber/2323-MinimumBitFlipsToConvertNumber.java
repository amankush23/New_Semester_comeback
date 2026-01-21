// Last updated: 21/01/2026, 11:57:22
class Solution {
    public int minBitFlips(int start, int goal) {
        int n = start ^ goal;
        int set = 0;
        while(n > 0) {
            n = (n & (n-1));
            set++;
        }
        return set;
    }
}