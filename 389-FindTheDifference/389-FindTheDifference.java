// Last updated: 8/4/2025, 11:11:38 PM
class Solution {
    public char findTheDifference(String s, String t) {
        int sum = 0;

        for (char c : t.toCharArray()) {
            sum += c;
        }

        for (char c : s.toCharArray()) {
            sum -= c;
        }

        return (char) sum;
    }
}
