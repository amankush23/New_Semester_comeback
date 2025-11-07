// Last updated: 11/7/2025, 9:55:43 PM
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) {
            return result;
        }
        
        int i = 0;
        while (i < nums.length) {
            int start = nums[i];
            int j = i;
            // Expand the range as long as elements are consecutive
            while (j + 1 < nums.length && nums[j + 1] == nums[j] + 1) {
                j++;
            }
            
            // Format the range string
            if (nums[j] == start) {
                result.add(String.valueOf(start));
            } else {
                result.add(start + "->" + nums[j]);
            }
            
            // Move to the next potential start of a range
            i = j + 1;
        }
        return result;
    }
}