// Last updated: 8/4/2025, 11:12:38 PM
class Solution {
    public int maximumGap(int[] nums) {
        return maximumgap(nums);
    }
    public static int maximumgap(int[] nums) {
        Arrays.sort(nums);
        int maxgap = 0;
        if(nums.length<2) {
            return 0;
        } else {
            for (int i = 1; i < nums.length; i++) {
                int diff = nums[i]- nums[i-1];
                maxgap = Math.max(maxgap, diff);
            }
        }
        return maxgap;
    }
}