// Last updated: 12/19/2025, 10:41:46 PM
1class Solution {
2    public int canCompleteCircuit(int[] gas, int[] cost) {
3        return canComplete(gas, cost);
4    }
5    public static int canComplete(int[] gas, int[] cost){
6        int total = 0;
7        for(int i =0; i < cost.length ; i++){
8            total += gas[i] - cost[i];
9        }
10        if(total < 0){
11            return -1; 
12        }
13        int idx =0;
14        int curr =0;
15        for(int i = 0; i < cost.length; i++){
16            curr += gas[i] - cost[i];
17            if(curr < 0){
18                curr = 0; 
19                idx = i+1;
20            }
21    }return idx;
22    
23            
24    }
25}