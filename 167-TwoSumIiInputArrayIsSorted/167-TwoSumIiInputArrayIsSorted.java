// Last updated: 8/4/2025, 11:12:36 PM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        return twosum(numbers, target);
    }
    public static int[] twosum(int[] numbers, int target) {
        int[] ans = {-1,-1};
        int i = 0;
        int j = numbers.length-1;
        while (i < j) {
            int sum = numbers[i]+numbers[j];
            if(sum == target) {
                ans[0] = i+1;
                ans[1] = j+1;
                return ans;
            } else if(sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return ans;
    }
}