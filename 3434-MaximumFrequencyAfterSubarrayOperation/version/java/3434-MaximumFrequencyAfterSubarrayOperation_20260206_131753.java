// Last updated: 06/02/2026, 13:17:53
1
2class Solution {
3
4    public int maxFrequency(int[] nums, int k) {
5        HashMap<Integer, Integer> map = new HashMap<>();
6        for(int a: nums){
7            map.put(a, map.getOrDefault(a, 0)+1);
8        }
9        int res = 0;
10        for(int a: map.keySet()){
11            res = Math.max(res, kedan(nums, k, a));
12        }
13        return map.getOrDefault(k,0)+res;
14    }
15    public int kedan(int[] nums, int k, int b){
16        int res=0, curr= 0;
17        for(int a: nums){
18            if(k == a) curr--;
19            if(a == b) curr++;
20            if(curr < 0) curr = 0;
21            res = Math.max(res, curr);
22
23        }
24        return res;
25
26    }
27
28}