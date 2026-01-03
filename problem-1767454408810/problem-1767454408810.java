// Last updated: 1/3/2026, 9:03:28 PM
1class Solution {
2    public String reversePrefix(String s, int k) {
3        StringBuilder xy = new StringBuilder();
4        for(int i = k-1; i >= 0; i--){
5            xy.append(s.charAt(i));
6        }
7        for(int i = k ; i < s.length();i++){
8
9            xy.append(s.charAt(i));
10        }
11    return xy.toString();
12    }
13}