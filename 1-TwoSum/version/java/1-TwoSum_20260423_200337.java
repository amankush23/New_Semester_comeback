// Last updated: 23/04/2026, 20:03:37
1import java.util.HashMap;
2import java.util.Map;
3
4class Solution {
5    public int[] twoSum(int[] nums, int target) {
6        Map<Integer, Integer> numMap = new HashMap<>();
7        int n = nums.length;
8        for (int i = 0; i < n; i++) {
9            int complement = target - nums[i];
10            if (numMap.containsKey(complement)) {
11                return new int[]{numMap.get(complement), i};
12            }
13            numMap.put(nums[i], i);
14        }
15
16        return new int[]{}; // Not reachable
17    }
18}