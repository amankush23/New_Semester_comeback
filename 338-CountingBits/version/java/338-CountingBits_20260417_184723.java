// Last updated: 17/04/2026, 18:47:23
1class Solution {
2    public int[] countBits(int n) {
3        return solve(n);
4    }
5    public int[] solve(int n){
6        int[] arr = new int[n+1];
7
8        for(int i = 0; i <= n;i++){
9            int count = 0;
10            int num = i;
11            while(num > 0){
12                if((num & 1) != 0){
13                    count++;
14                }
15                num = num >> 1;
16            }
17            arr[i] = count;
18        }
19        return arr;
20    }
21}