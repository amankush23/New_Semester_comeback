// Last updated: 8/4/2025, 11:09:05 PM
class Solution {
    public int[] GetFinalState(int[] nums, int k, int multiplier) {
        return getFinalState(nums, k, multiplier);
    }
    public static int Min_ele(int[] arr ){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == min) {
                pos = i;
                break;
            }
        }
        return pos;
    }
    public static int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < nums.length; j++) {
                int min = Min_ele(nums);
                if(j == min) {
                    nums[j] = nums[min]*multiplier;
                    break;
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {1,2};
        int k = 3;
        int multiplier = 4;
        // int[] nums = {2,1,3,5,6};
        // int k = 5;
        // int multiplier = 2;
        int[] ans = getFinalState(nums, k, multiplier);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}