// Last updated: 10/6/2025, 3:42:10 PM
public class Solution {
    public int maximumBags(int[] C, int[] R, int add) {
        int n = R.length, cnt = 0;
        for (int i = 0; i < n; i++) {
            R[i] = C[i] - R[i];
        }
        Arrays.sort(R);
        for (int i = 0; i < n && (R[i] - add) <= 0; i++) {
            cnt++;
            add -= R[i];
        }
        return cnt;
    }
}