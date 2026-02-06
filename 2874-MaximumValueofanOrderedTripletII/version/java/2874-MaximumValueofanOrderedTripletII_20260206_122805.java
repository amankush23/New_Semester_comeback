// Last updated: 06/02/2026, 12:28:05
1class Solution {
2        public long maximumTripletValue(int[] A) {
3        long res = 0, maxa = 0, maxab = 0;
4        for (int a : A) {
5            res = Math.max(res, 1L * maxab * a);
6            maxab = Math.max(maxab, maxa - a);
7            maxa = Math.max(maxa, a);
8        }
9        return res;
10    }
11}