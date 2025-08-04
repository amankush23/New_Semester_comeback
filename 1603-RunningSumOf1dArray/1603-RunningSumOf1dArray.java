// Last updated: 8/4/2025, 11:10:37 PM
class Solution {
    public int[] runningSum(int[] nums) {
        return Run_Sum(nums);
    }
    public static int[] Run_Sum(int[] nums) {   
        for (int i = 1; i < nums.length; i++) { 
            nums[i] = nums[i]+nums[i-1];       
        }                                       
        return nums;                            
    } 
}