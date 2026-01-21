// Last updated: 21/01/2026, 11:57:09
class Solution {
    public int edgeScore(int[] edges) {
        long[] sum = new long[edges.length];

        for (int i = 0; i < edges.length; i++) {
            sum[edges[i]] += i;
        }

        long max = -1;
        int res = 0;

        for (int i = 0; i < sum.length; i++) {
            if (sum[i] > max) {
                max = sum[i];
                res = i;
            }
        }
        return res;
    }
}