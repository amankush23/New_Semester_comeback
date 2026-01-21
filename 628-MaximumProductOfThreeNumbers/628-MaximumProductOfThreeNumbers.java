// Last updated: 21/01/2026, 12:00:14
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int posProduct = nums[n-1]*nums[n-2]*nums[n-3];
        int negProduct = nums[0] * nums[1] * nums[n-1];
        int ans = Math.max(posProduct, negProduct);
        return ans;
    }
}