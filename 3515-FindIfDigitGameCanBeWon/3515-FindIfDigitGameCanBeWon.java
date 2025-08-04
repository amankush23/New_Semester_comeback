// Last updated: 8/4/2025, 11:09:03 PM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int single_sum = 0;
        int double_sum = 0;
        for (int n : nums){
            if (n < 10){
                single_sum += n;
            } else if (n >= 10) {
                double_sum += n;
            }
        }
        if (single_sum == double_sum){
            return false;
        } else {
            return true;
        }   
    }
}