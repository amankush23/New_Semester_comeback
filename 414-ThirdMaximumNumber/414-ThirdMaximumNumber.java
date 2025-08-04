// Last updated: 8/4/2025, 11:11:37 PM
import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums); 
        int count = 1; 
        for(int i = nums.length - 2; i >= 0; i--) {
            if(nums[i] != nums[i + 1]) {
                count++;
                if(count == 3) {
                    return nums[i];
                }
            }
        }
        return nums[nums.length - 1]; 
    }
}
