// Last updated: 06/02/2026, 14:11:36
1public class Solution{
2public int maxFrequency(int[] A , int k) {
3        int count[] = new int[51], res = 0;
4        for (int a : A) {
5            count[a] = Math.max(count[a], count[k]) + 1;
6            res = Math.max(res, count[a] - count[k]);
7        }
8        return count[k] + res;
9    }
10}