// Last updated: 8/4/2025, 11:14:18 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        return LengthOfLongestSubstring(s);
    }
    public static int LengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}