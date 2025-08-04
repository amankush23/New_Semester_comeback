// Last updated: 8/4/2025, 11:10:39 PM
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        return abhi_wale_se_chhota_number(nums);
    }
    public static int[] abhi_wale_se_chhota_number(int[] nums){
        int[] output = new int[nums.length];
        int[] count = new int[101]; // Since 0 <= nums[i] <= 100

        // Count the occurrences of each number
        for(int i : nums) { 
            count[i]++;
        }

        // Calculate the cumulative count
        for(int i = 1; i < 101; i++) {
            count[i] += count[i - 1];
        }

        // Fill the output array
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                output[i] = 0;
            } else {
                output[i] = count[nums[i] - 1];
            }
        }
        return output;
    }
}