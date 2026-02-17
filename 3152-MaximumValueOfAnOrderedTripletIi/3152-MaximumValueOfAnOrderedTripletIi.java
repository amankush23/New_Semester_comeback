// Last updated: 17/02/2026, 10:46:27
class Solution {
        public long maximumTripletValue(int[] A) {
        long res = 0, a = 0, b = 0;
        for (int k : A) {
            res = Math.max(res, (long)b * k);
            b = Math.max(b, a - k);
            a = Math.max(a, k);
        }
        return res;
    }
}