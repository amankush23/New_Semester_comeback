// Last updated: 28/09/2026, 14:14:57
1class Solution {
2    public void sortColors(int[] nums) {
3
4        int low = 0;
5        int mid = 0;
6        int high = nums.length - 1;
7
8        while (mid <= high) {
9
10            if (nums[mid] == 0) {
11                swap(nums, low, mid);
12                low++;
13                mid++;
14            }
15
16            else if (nums[mid] == 1) {
17                mid++;
18            }
19
20            else { // nums[mid] == 2
21                swap(nums, mid, high);
22                high--;
23            }
24        }
25    }
26
27    public void swap(int[] nums, int i, int j) {
28        int temp = nums[i];
29        nums[i] = nums[j];
30        nums[j] = temp;
31    }
32}