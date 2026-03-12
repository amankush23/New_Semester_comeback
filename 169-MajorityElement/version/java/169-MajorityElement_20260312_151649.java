// Last updated: 12/03/2026, 15:16:49
1class Solution {
2    public int majorityElement(int[] nums) {
3
4        int candidate = 0;
5        int count = 0;
6
7        for(int num : nums){
8            if(count == 0){
9                candidate = num;
10            }
11
12            if(num == candidate){
13                count++;
14            } else {
15                count--;
16            }
17        }
18
19        return candidate;
20    }
21}