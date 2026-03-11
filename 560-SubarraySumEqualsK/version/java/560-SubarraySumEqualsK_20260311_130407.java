// Last updated: 11/03/2026, 13:04:07
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        int n = nums.length;
4        int[] pref = new int[n];
5        int count = 0;
6        pref[0] = nums[0];
7        for(int i =1; i < n ;i++){
8            pref[i] = pref[i-1] + nums[i];
9        }
10        for(int i = 0; i < n; i++){
11            if(pref[i] == k) count++;
12            for(int j = i+1; j < n; j++){
13                if(pref[j]-pref[i] == k) count++;
14            }
15        }
16        return count;
17    }
18}