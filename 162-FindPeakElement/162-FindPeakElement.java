// Last updated: 8/4/2025, 11:12:40 PM
class Solution {
    public int findPeakElement(int[] nums) {
        return chhoti_ka_element(nums);
    }
    public int chhoti_ka_element(int[] arr){
        int n = arr.length;
        //Handling Edge Cases
        if (n == 1) return 0;
        if (n == 2){
            if (arr[0] > arr[1]) return 0;
            else return 1;
        }
        if (arr[0] > arr[1]) return 0;
        if (arr[n-1] > arr[n-2]) return n-1;

        //Handling the middle element in binary search
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