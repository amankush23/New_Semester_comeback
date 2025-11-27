// Last updated: 11/27/2025, 12:33:45 PM
1class Solution {
2    public int hammingWeight(int n) {
3        return Count_Bit(n);
4    }
5    public static int Count_Bit(int n ){
6        int ans=  0 ;
7        while(n > 0){
8            ans++;
9            n = n &(n-1);
10        }
11        return ans;
12    }
13}