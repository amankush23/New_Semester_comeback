// Last updated: 8/4/2025, 11:10:58 PM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        return pahaad_ki_chhoti(arr);
    }
    public int pahaad_ki_chhoti(int[] arr){
        int n = arr.length;
        int low = 1;
        int high = n-2;
        while(low <= high){
            int mid = low + (high - low)/2;
            if (arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) return mid;
            else if (arr[mid-1] < arr[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}