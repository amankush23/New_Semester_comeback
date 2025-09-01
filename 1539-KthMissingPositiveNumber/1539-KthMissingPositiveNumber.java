// Last updated: 9/1/2025, 11:46:16 PM
class Solution {
    public int findKthPositive(int[] arr, int k) {
         
        // Problem: Find the kth missing positive number from a sorted array
        // Approach: Use Binary Search
       // Idea: At index mid, number of missing elements = arr[mid] - (mid + 1)
       // If missing < k  move right (low = mid + 1)
       // Else  move left (high = mid - 1)
      // Final answer = k + high + 1
        
        int n = arr.length;

        int low = 0 , high = n -1;

        while(low <= high){

            int mid = (low + high )/2;

            int missing = arr[mid] - (mid + 1);

            if(missing < k ){
                low = mid + 1;

            }else{
                high = mid - 1;
            }
        }

        return k + high + 1;
        
    }
}