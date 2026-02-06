// Last updated: 06/02/2026, 12:31:06
1class Solution {
2        public long maximumTripletValue(int[] A) {
3        long res = 0, a = 0, b = 0;
4        for (int k : A) {
5            res = Math.max(res, (long)b * k);
6            b = Math.max(b, a - k);
7            a = Math.max(a, k);
8        }
9        return res;
10    }
11}