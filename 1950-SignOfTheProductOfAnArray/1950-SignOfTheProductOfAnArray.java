// Last updated: 8/4/2025, 11:10:13 PM
class Solution {
    public int arraySign(int[] nums) {
        int cn = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            }
            if (nums[i] < 0) {
                cn++;
            }
        }
        if (cn % 2 == 1) {
            return -1;
        } else {
            return 1;
        }
    }
}