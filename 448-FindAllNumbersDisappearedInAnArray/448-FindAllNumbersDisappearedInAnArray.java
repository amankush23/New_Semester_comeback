// Last updated: 8/4/2025, 11:11:30 PM
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;

        // Mark presence by negating the value at the index corresponding to each number
        for (int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]) - 1; // Convert num to index
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        List<Integer> result = new ArrayList<>();

        // Numbers whose corresponding index is positive are missing
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }
}
