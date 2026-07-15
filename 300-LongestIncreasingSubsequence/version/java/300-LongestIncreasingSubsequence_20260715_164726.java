// Last updated: 15/07/2026, 16:47:26
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        if(nums == null || nums.length == 0){
4            return 0;
5        }
6        List<Integer> tail = new ArrayList<>();
7
8        for(int num : nums){
9
10            if(tail.isEmpty() || num > tail.get(tail.size()-1)){
11                tail.add(num);
12
13            }
14            else {
15                int l = 0;
16                int r = tail.size()-1;
17                while(l <= r){
18                    int mid = l+(r-l)/2;
19                    if(tail.get(mid) < num){
20                        l = mid+1;
21                    }
22                    else{
23                        r = mid-1;
24                    }
25                }
26                tail.set(l, num);
27
28            }
29        }
30        return tail.size();
31    }
32}