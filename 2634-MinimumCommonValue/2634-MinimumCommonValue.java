// Last updated: 8/4/2025, 11:09:27 PM
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        return GetCommon(nums1,nums2);
    }
    public int GetCommon(int[] nums1, int[] nums2) {
        int i = 0; 
        int j = 0;
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] == nums2[j]) {
                 return nums1[i];
               
            } else if(nums1[i] < nums2[j]) {
                i++; 
            } else {
                j++;
            }
        }
        return -1;
    }
}