// Last updated: 21/01/2026, 11:56:21
class Solution {
    public long minEnd(int n, int x) {
        long res = x;
        long r = n - 1;
        long pos = 1;
        
        while (r != 0) {
            if ((x & pos) == 0) {
                res |= (r & 1) * pos;
                r >>= 1;
            }
            pos <<= 1;
        }
        
        return res;
    }
}