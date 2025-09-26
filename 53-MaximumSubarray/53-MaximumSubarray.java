// Last updated: 9/26/2025, 3:24:30 PM
class Solution {
    public int maxSubArray(int[] nums) {
        return maxSubarraySum(nums);
    }
    public static int maxSubarraySum(int[] arr){
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0 ; i< arr.length; i++){
            sum += arr[i];
            ans = Math.max(ans, sum);
            //kadanes algorithm
            if(sum<0){
                sum = 0;
            }
        }
        return ans;
    }
}