// Last updated: 8/4/2025, 11:13:43 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        return targetdhoondo(nums, target);
    }
    public int targetdhoondo(int[] n, int t){
        int len = n.length;
        //Handling Edge Cases
        if (n[0] == t) return 0;
        if (n[len-1] == t) return len-1;

        //Handling the Middle Element
        int low = 0;
        int high = len-1;
        while (low <= high){
            //Defining the middle element
            int mid = low + (high - low)/2;
            //Defining the BS(Binary Search) conditions
            if (n[mid] < t) low = mid + 1;
            else if(n[mid] > t) high = mid - 1;
            else return mid; 
        }
        
        //Finding the element just smaller than the target and then returning the index + 1.
        boolean test = Arrays.asList(n).contains(t);
        int index = -1; 
        if (test == false){
            int difference = Integer.MAX_VALUE;
            for (int i = 0; i < len; i++) {
                if (n[i] < t && (t - n[i]) < difference) {
                    index = i;
                    difference = t - n[i];
                }
            }
        }
        return index + 1; 
    }
}