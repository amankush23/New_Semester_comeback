// Last updated: 8/23/2025, 11:38:54 PM
class Solution {
    public int subarraySum(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        
        // Step 1: Build prefix sum array
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        
        int totalSum = 0;
        
        // Step 2: For each i, calculate subarray sum
        for (int i = 0; i < n; i++) {
            int start = Math.max(0, i - nums[i]);
            
            if (start == 0) {
                totalSum += prefix[i];
            } else {
                totalSum += prefix[i] - prefix[start - 1];
            }
        }
        
        return totalSum;
    }
}
