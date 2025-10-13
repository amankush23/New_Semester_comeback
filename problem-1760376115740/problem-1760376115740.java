// Last updated: 10/13/2025, 10:51:55 PM
class Solution {
    int res = 0;
    public int countArrangement(int n) {
        if (n == 0) return 0;
        backtrack(1, n, new int[n+1]);
        return res;
    }

    private void backtrack(int si, int ei, int[] usedValueArr) {
        if (si > ei) {
            res++;
            return;
        }
        for (int i = 1; i <= ei; i++) {
            if (usedValueArr[i] == 0 && (si % i == 0 || i % si == 0)) {
                usedValueArr[i] = 1;
                backtrack(si+1, ei, usedValueArr);
                usedValueArr[i] = 0;
            }
        }
    }
}