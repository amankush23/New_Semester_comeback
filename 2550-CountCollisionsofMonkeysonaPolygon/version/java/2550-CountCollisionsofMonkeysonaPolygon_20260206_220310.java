// Last updated: 06/02/2026, 22:03:10
1class Solution {
2    static final long MOD = 1000000007;
3    public int monkeyMove(int n) {
4        long ans = (pow(n) - 2 + MOD) % MOD;
5        return (int) ans;
6    }
7    public static long pow(int n) {
8        if (n == 0) return 1;      
9        if (n == 1) return 2;
10
11        long half = pow(n / 2);
12        long res = (half * half) % MOD;
13        if (n % 2 == 1) {
14            res = (res * 2) % MOD;
15        }
16        return res;
17    }
18}