// Last updated: 8/4/2025, 11:13:54 PM
class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        // int[] arr = new int[n];
        int idx = 0;
        int count=0;
        for(int i = 0 ; i < n; i++){
            if(nums[i] != val){
                nums[idx++] = nums[i];
                count++;
            }
        }
        return count;
    }
}