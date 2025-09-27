// Last updated: 9/27/2025, 10:02:35 PM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] sortedArr = new int[m+n];
        for(int i = 0; i < m; i++){
            sortedArr[i] = nums1[i];
        }
        for(int j = 0 ; j < n; j++){
            sortedArr[m+j] = nums2[j];
        }
        Arrays.sort(sortedArr);
        for (int k = 0; k < m + n; k++) {
            nums1[k] = sortedArr[k];
        }
    }
}