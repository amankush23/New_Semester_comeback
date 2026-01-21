// Last updated: 21/01/2026, 11:56:24
class Solution {
    public long numberOfSubarrays(int[] nums) {
       long ans = 0;
        Deque<int[]> stack = new ArrayDeque<>(); 
        for (int n : nums) {
            int count = 1;
            while (!stack.isEmpty() && stack.peek()[0] < n) {
                stack.pop();
            }           
            if (!stack.isEmpty() && stack.peek()[0] == n) {
                count += stack.peek()[1];
                stack.peek()[1] = count;
            } else {
                stack.push(new int[]{n, count});
            }
            ans += count; 
        }
        return ans;
    }
}