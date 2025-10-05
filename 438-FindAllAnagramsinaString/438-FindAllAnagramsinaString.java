// Last updated: 10/6/2025, 1:11:23 AM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (s.length() < p.length()) return res;
        int[] a = new int[26];
        int[] b = new int[26];
        for (char c : p.toCharArray()){
            b[c - 'a']++;
        }
        int n = p.length();
        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i) - 'a']++;
            if (i >= n) a[s.charAt(i - n) - 'a']--;
            if (Arrays.equals(a, b)) res.add(i - n + 1);
        }
        return res;
    }
}