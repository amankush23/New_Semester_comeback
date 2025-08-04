// Last updated: 8/4/2025, 11:12:02 PM
class Solution {
    public int missingNumber(int[] nums) {
        int xor1 = nums.length, xor2 = 0;
        for(int i = 0; i < nums.length; i++){
            xor2 ^= nums[i];
            xor1 ^= i;
        }
        return xor1 ^ xor2;
    }
}