// Last updated: 8/4/2025, 11:09:00 PM
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        return SneakyNumbers(nums);
    }
    public static int[] SneakyNumbers(int[] nums){
        int count = 0;
        int[] array = new int[2]; 
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    array[count] = nums[i];
                    count++;
                    if (count == 2) { 
                    return array;
                    }
                }
            }
        }
        return array; 
    }
}
