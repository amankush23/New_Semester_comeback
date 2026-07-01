// Last updated: 02/07/2026, 01:08:38
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        char[] arr1 = s.toCharArray();
4        char[] arr2 = t.toCharArray();
5        Arrays.sort(arr1);
6        Arrays.sort(arr2);
7        return Arrays.equals(arr1, arr2);
8    }
9}