// Last updated: 1/2/2026, 11:51:31 PM
1class Solution {
2    public int edgeScore(int[] edges) {
3        long[] sum = new long[edges.length];
4
5        for (int i = 0; i < edges.length; i++) {
6            sum[edges[i]] += i;
7        }
8
9        long max = -1;
10        int res = 0;
11
12        for (int i = 0; i < sum.length; i++) {
13            if (sum[i] > max) {
14                max = sum[i];
15                res = i;
16            }
17        }
18        return res;
19    }
20}