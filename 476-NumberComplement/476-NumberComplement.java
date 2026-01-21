// Last updated: 21/01/2026, 12:00:35
class Solution {
    public int findComplement(int n) {
        int bit = 0;
        int x = n;
        while(n > 0) {
            n >>= 1;
            bit++;
        }
        int mask = (1 << bit) - 1;
        // System.out.println(mask);
        return x ^ mask;
    }
}