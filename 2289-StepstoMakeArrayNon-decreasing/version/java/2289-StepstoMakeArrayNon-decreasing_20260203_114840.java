// Last updated: 03/02/2026, 11:48:40
1class Solution {
2    public int totalSteps(int[] nums) {
3        Stack<int[]> stack = new Stack<>();
4        int ans = 0;
5        for (int i = nums.length - 1; i >= 0; i--) {
6            int steps = 0;
7            while (!stack.isEmpty() && nums[i] > stack.peek()[0]) {
8                steps = Math.max(steps + 1, stack.pop()[1]);
9            }
10            ans = Math.max(ans, steps);
11            stack.push(new int[]{nums[i], steps});
12        }
13        return ans;
14    }
15}
16