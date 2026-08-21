// Last updated: 21/08/2026, 23:16:26
1class Solution {
2    public String reverseWords(String s) {
3    s = s.trim();
4    String [] arr =s.split("\\s+");
5    String ans = " ";
6    for(int i = arr.length-1; i>=0; i--){
7        ans += arr[i] + " ";
8
9   }
10   return ans.trim();
11
12   }
13}