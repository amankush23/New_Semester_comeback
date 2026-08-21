// Last updated: 21/08/2026, 22:38:37
1class Solution {
2    public boolean isPalindrome(String s) {
3        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
4        boolean r = palindrome(str);
5        return r;
6
7    }
8    public static boolean palindrome(String str){
9        int i = 0, j = str.length()-1;
10        while(i < j){
11            if(str.charAt(i) != str.charAt(j)){
12                return false;
13            }
14            i++;
15            j--;
16
17        }
18            return true;
19    }
20}