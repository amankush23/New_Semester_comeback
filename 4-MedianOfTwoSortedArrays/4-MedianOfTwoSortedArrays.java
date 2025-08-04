// Last updated: 8/4/2025, 11:14:15 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return FindMedianSortedArrays(nums1,nums2);
    }
         public static void selectionSort(int[] array) {
         int n = array.length;
         for (int i = 0; i < n - 1; i++) {
             int minIndex = i;
             for (int j = i + 1; j < n; j++) {
                 if (array[j] < array[minIndex]) {
                     minIndex = j;
                 }
             }
             // Swap the found minimum element with the first element
             int temp = array[minIndex];
             array[minIndex] = array[i];
             array[i] = temp;
         }
     }

    public static double FindMedianSortedArrays(int[] nums1, int[] nums2) {
        int merge[] = new int[nums1.length+nums2.length];
        int n = merge.length;
        for (int i = 0; i < n; i++) {
            if(i < nums1.length) {
                merge[i] = nums1[i];
            } else {
                merge[i] = nums2[i-nums1.length];
            }
        }
        double x = 0;
        selectionSort(merge);
        if(n % 2 != 0) {
           x = merge[n/2];
        } else {
            int middle1 = merge[n / 2 - 1];
            int middle2 = merge[n / 2];
            double median = (middle1 + middle2) / 2.0;
            x = median;
        }
        return x;
    }
}