// Last updated: 1/4/2026, 10:51:47 PM
1class Solution {
2    public int canCompleteCircuit(int[] gas, int[] cost) {
3        int totalGas = 0;
4        int totalCost = 0;
5        int tank = 0;
6        int start = 0;
7
8        for (int i = 0; i < gas.length; i++) {
9            totalGas += gas[i];
10            totalCost += cost[i];
11
12            tank += gas[i] - cost[i];
13            if (tank < 0) {
14                start = i + 1;
15                tank = 0;
16            }
17        }
18
19        return totalGas >= totalCost ? start : -1;
20    }
21}
22