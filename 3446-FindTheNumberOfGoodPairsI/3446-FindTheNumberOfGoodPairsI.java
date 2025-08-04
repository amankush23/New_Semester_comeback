// Last updated: 8/4/2025, 11:09:08 PM
class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        return countGoodPairs(nums1, nums2, k);
    }
    public static int countGoodPairs(int[] nums1, int[] nums2, int k) {
        int count = 0;
        int n = nums1.length;
        int m = nums2.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (nums1[i] % (nums2[j] * k) == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}