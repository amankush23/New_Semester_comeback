// Last updated: 1/5/2026, 10:05:23 PM
1class Solution {
2    public int climbStairs(int n) {
3        Map<Integer, Integer> memo = new HashMap<>();
4        return climbStairs(n, memo);
5    }
6    
7    private int climbStairs(int n, Map<Integer, Integer> memo) {
8        if (n == 0 || n == 1) {
9            return 1;
10        }
11        if (!memo.containsKey(n)) {
12            memo.put(n, climbStairs(n-1, memo) + climbStairs(n-2, memo));
13        }
14        return memo.get(n);
15    }
16}