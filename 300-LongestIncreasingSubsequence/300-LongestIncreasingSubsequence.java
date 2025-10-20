// Last updated: 10/20/2025, 2:49:02 PM
class Solution {
    public int lengthOfLIS(int[] nums) {
        return LIS(nums);
    }
    public static int LIS(int[] arr){
        int[] dp  = new int [arr.length];
        int len=1;
        dp[0] =arr[0];
        for(int i =1; i < dp.length; i ++){
            if(arr[i] > dp[len-1]){
                dp[len] = arr[i];
                len++;
            }
            else{
                int idx = Arrays.binarySearch(dp, 0, len-1, arr[i]);
                if (idx < 0) idx = -(idx + 1);
                dp[idx] = arr[i];

            }
        }
        return len;
    }
}