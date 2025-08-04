// Last updated: 8/4/2025, 11:12:49 PM
class Solution {
    public int singleNumber(int[] nums) {
        int xorr = 0;
        for(int i = 0; i < nums.length; i++){
            xorr ^= nums[i];
        }
        return xorr;
    }
}