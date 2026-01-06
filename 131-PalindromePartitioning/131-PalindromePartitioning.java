// Last updated: 1/6/2026, 12:49:07 PM
1public class Solution {
2    public List<List<String>> partition(String s) {
3        List<List<String>> result = new ArrayList<>();
4        backtrack(s, 0, new ArrayList<>(), result);
5        return result;
6    }
7
8    private void backtrack(String s, int start, List<String> path, List<List<String>> result) {
9        if (start == s.length()) {
10            result.add(new ArrayList<>(path));
11            return;
12        }
13        for (int end = start + 1; end <= s.length(); end++) {
14            if (isPalindrome(s, start, end - 1)) {
15                path.add(s.substring(start, end));
16                backtrack(s, end, path, result);
17                path.remove(path.size() - 1);
18            }
19        }
20    }
21
22    private boolean isPalindrome(String s, int left, int right) {
23        while (left < right) {
24            if (s.charAt(left++) != s.charAt(right--)) {
25                return false;
26            }
27        }
28        return true;
29    }
30}