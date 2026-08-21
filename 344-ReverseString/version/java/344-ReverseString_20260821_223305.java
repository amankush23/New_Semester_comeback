// Last updated: 21/08/2026, 22:33:05
1class Solution {
2    public void reverseString(char[] s) {
3        int left = 0, right = s.length-1;
4        while(left < right){
5            char temp = s[left];
6            s[left] = s[right];
7            s[right] = temp;
8
9            left ++;
10            right --;
11        }
12    }
13}
14