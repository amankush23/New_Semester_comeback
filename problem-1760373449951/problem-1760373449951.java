// Last updated: 10/13/2025, 10:07:29 PM
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int[] a = new int[26];
        int[] b = new int[26];
        for (char c : s1.toCharArray()) a[c - 'a']++;
        int n = s1.length();
        for (int i = 0; i < s2.length(); i++) {
            b[s2.charAt(i) - 'a']++;
            if (i >= n) b[s2.charAt(i - n) - 'a']--;
            if (Arrays.equals(a, b)) return true;
        }
        return false;
    }
}