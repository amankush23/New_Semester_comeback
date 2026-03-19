// Last updated: 19/03/2026, 16:32:09
1class Solution {
2    public boolean isHappy(int n) {
3        HashSet<Integer> set = new HashSet<>();
4        while(n != 1){
5            if(set.contains(n)) return false;
6            set.add(n);
7            n = sq_Sum(n);
8        }
9        return true;
10    }
11    public int sq_Sum(int n){
12        int sum = 0;
13        while(n > 0){
14            int digit = n % 10;
15            sum += Math.pow(digit, 2);
16            n = n / 10;
17        }
18        return sum;
19    }
20}