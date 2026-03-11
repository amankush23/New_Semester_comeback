// Last updated: 11/03/2026, 17:35:02
1class Solution {
2    public int majorityElement(int[] nums) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        for(int num: nums){
5            map.put(num, map.getOrDefault(num, 0)+1);
6        }
7        int n=nums.length;
8        for(int key: map.keySet()){
9            if(map.get(key) > n/2){
10                return key;
11            }
12        }
13        return -1;
14    }
15}