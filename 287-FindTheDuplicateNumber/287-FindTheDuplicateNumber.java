// Last updated: 8/4/2025, 11:11:56 PM
class Solution {
    public int findDuplicate(int[] nums) {
        return FindDuplicate(nums);
    }
    public static int FindDuplicate(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]) {
                ans = nums[i];
            }
        }
        return ans;
    }
}