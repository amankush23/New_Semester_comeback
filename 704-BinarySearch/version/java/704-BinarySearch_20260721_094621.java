// Last updated: 21/07/2026, 09:46:21
1class Solution {
2    public int search(int[] nums, int target) {
3        int low = 0;
4        int hi = nums.length - 1;
5
6        while (low <= hi) {
7            int mid = low + (hi - low) / 2;
8            if (nums[mid] == target) {
9
10                return mid;
11            } else if (nums[mid] > target) {
12                hi = mid - 1;
13            } else {
14                low = mid + 1;
15            }
16
17        }
18        return -1;
19    }
20
21}