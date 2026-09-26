// Last updated: 26/09/2026, 15:56:57
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        int count =0;
4        int prefixSum = 0;
5        HashMap<Integer, Integer > map = new HashMap<>();
6        map.put(0, 1);
7        for(int i = 0 ;i < nums.length; i++){
8            prefixSum += nums[i];
9            int target = prefixSum - k;
10            if(map.containsKey(target)){
11                count += map.get(target);
12            }
13            map.put(prefixSum, map.getOrDefault(prefixSum, 0)+1);
14        }
15        return count;
16    }
17}