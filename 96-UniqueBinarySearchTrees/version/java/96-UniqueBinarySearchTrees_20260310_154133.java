// Last updated: 10/03/2026, 15:41:33
1// class Solution {
2//     public int fact(int n) {
3//         int p = 1;
4//         int dp[] = new int[n];
5//         dp[0] = 1;
6//         for(int i = 1; i <n; i++) {
7//             dp[i] = dp[i-1]*(i+1);
8//         }
9//         return dp[n-1];
10//     }
11//     // public int numTrees(int n) {
12//     //     int[] bt = {
13//     //         1, 2, 5, 14, 42, 132, 429, 1430, 4862, 16796,
14//     //         58786, 208012, 742900, 2674440, 9694845, 35357670,
15//     //         129644790, 477638700, 1767263190
16//     //     };
17//     //     return bt[n-1];
18//     // }
19
20//      public int numTrees(int n) {
21//         int ans = fact(2 * n) / (fact(n+1) * fact(n));
22//         return ans;
23//     }
24// }
25
26class Solution {
27    public int numTrees(int n) {
28        long ans = 1;
29        for(int i = 0; i < n; i++)
30            ans = ans * 2 * (2*i + 1) / (i + 2);
31        return (int)ans;
32    }
33}