// Last updated: 8/4/2025, 11:12:04 PM
class Solution {
    public int[] singleNumber(int[] nums) {
        return singlenumber(nums);
    }
    public static int[] singlenumber(int[] nums) {
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                int y = nums[j];
                if(x == y) {
                    nums[i] = 0;
                    nums[j] = 0;
                }
            }
        }
        int ind = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                ans[ind++] = nums[i];
            }
        }
        return ans;
    }
}