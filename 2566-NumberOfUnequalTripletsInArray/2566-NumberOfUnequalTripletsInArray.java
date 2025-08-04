// Last updated: 8/4/2025, 11:09:31 PM
import java.util.Arrays;

class Solution {
    public int unequalTriplets(int[] nums) {
        Arrays.sort(nums); 
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] != nums[j] && nums[j] != nums[k] && nums[i] != nums[k]) {
                        c++;
                    }
                }
            }
        }
        return c;
    }
}
