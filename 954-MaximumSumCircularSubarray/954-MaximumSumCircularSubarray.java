// Last updated: 21/01/2026, 11:59:35
// class Solution {
//     public int maxSubarraySumCircular(int[] nums) {
        
        
//         int ans = Integer.MIN_VALUE;
//         sum = 0;
//         for(int i = 0; i<nums.length; i++) {
//             sum += nums[i];
//             ans = Math.max(sum, ans);
//             if(sum <  0) {
//                 sum = 0;
//             }
//         }
//         return ans;
//     }

    
// }

class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int curMax = 0, maxSum = Integer.MIN_VALUE;
        int curMin = 0, minSum = Integer.MAX_VALUE;
        for (int num : nums) {
            curMax = Math.max(num, curMax + num);
            maxSum = Math.max(maxSum, curMax);
            curMin = Math.min(num, curMin + num);
            minSum = Math.min(minSum, curMin);
            totalSum += num;
        }
        if (totalSum == minSum) return maxSum;
        return Math.max(maxSum, totalSum - minSum);
    }
}
