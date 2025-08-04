// Last updated: 8/4/2025, 11:11:00 PM
class Solution {
    public int longestMountain(int[] A) {
        int res = 0;
        int n = A.length;

        for (int i = 1; i < n - 1;) {
            // Check if current is a peak
            if (A[i - 1] < A[i] && A[i] > A[i + 1]) {
                int count = 1;
                int j = i;

                // Go left (increasing sequence)
                while (j > 0 && A[j] > A[j - 1]) {
                    j--;
                    count++;
                }

                // Go right (decreasing sequence)
                int k = i;
                while (k < n - 1 && A[k] > A[k + 1]) {
                    k++;
                    count++;
                }

                res = Math.max(res, count);
                i = k; // Move i to end of mountain
            } else {
                i++; // Not a peak, just move forward
            }
        }

        return res;
    }
}
