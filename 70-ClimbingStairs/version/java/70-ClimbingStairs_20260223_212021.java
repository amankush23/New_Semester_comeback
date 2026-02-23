// Last updated: 23/02/2026, 21:20:21
1class Solution {
2    public int climbStairs(int n) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        return solve(n, map);
5    }
6    public int solve(int n, HashMap<Integer,Integer> map){
7        if(n == 0 || n == 1) return 1;
8        if(!map.containsKey(n)){
9            map.put(n, solve(n-1, map) + solve(n-2, map));
10        }
11        return map.get(n);
12    }
13}