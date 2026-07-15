// Last updated: 15/07/2026, 16:33:21
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        if (nums == null || nums.length == 0) {
4            return 0;
5        }
6
7        List<Integer> tail = new ArrayList<>(); // Stores the smallest tail of all increasing subsequences with length i+1 in tail[i]
8        for (int num : nums) {
9            if (tail.isEmpty() || num > tail.get(tail.size() - 1)) {
10                tail.add(num);
11            } else {
12                // Binary search to find the smallest element >= num in 'tail'
13                int left = 0;
14                int right = tail.size() - 1;
15                while (left <= right) {
16                    int mid = left + (right - left) / 2;
17                    if (tail.get(mid) < num) {
18                        left = mid + 1;
19                    } else {
20                        right = mid - 1;
21                    }
22                }
23                tail.set(left, num);
24            }
25        }
26
27        return tail.size();
28    }
29}
30