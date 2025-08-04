// Last updated: 8/4/2025, 11:13:06 PM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        merge_sorted_array(nums1,m,nums2,n);
        
    }
    public static void merge_sorted_array(int arr1[],int m,int arr2[],int n){
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(j>=0){
            if(i>=0 && arr1[i]>arr2[j]){
                arr1[k]=arr1[i];
                i--;
            }else{
                arr1[k]=arr2[j];
                j--;
            }
            k--;
        }

    }
}