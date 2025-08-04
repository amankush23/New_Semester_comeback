// Last updated: 8/4/2025, 11:09:51 PM
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] array = new int[n];
        int posIndex = 0;
        int negIndex = 1;

        for(int i = 0; i < n; i++){
            if(nums[i] < 0) {
                array[negIndex] = nums[i];
                negIndex += 2;
            } else {
                array[posIndex] = nums[i];
                posIndex += 2;
            }
        }
        return array;
    }
}