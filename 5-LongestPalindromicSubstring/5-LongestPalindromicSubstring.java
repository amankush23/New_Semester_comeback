// Last updated: 8/4/2025, 11:14:12 PM
class Solution {
    public String longestPalindrome(String s) {
        return longestPalindromicStr(s);
    }

    public static String longestPalindromicStr(String str) {
        String longest = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) { // Fixed loop range
                String sub = str.substring(i, j + 1); // j+1 to include last character
                if (isPalindrom(sub) && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }
        return longest;
    }

    public static boolean isPalindrom(String s) {
        int i = 0, j = s.length() - 1; // Fix j index
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
