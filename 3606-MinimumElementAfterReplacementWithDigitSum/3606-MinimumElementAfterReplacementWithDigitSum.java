// Last updated: 8/4/2025, 11:09:01 PM
class Solution {
    public int MinElement(int[] nums) {
        return minElement(nums);
    }
    public static int Sum_Digit(int n) {
        int sum = 0;
        while(n > 0) {
            int last_digit = n%10;
            sum+=last_digit;
            n /= 10;
        }
        return sum;
    }

    public static int Min_ele(int[] arr ){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }

    public static int minElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Sum_Digit(nums[i]);
        }
        return Min_ele(nums);
    }
    public static void main(String[] args) {
        // int[]  nums = {10,12,13,14};
        int[]  nums = {999,19,199};    //10
        System.out.println(minElement(nums));
    }
}