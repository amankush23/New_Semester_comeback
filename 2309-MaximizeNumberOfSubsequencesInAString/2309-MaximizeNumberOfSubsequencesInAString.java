// Last updated: 21/01/2026, 11:57:23
class Solution {
    public long maximumSubsequenceCount(String text, String pattern) {
    long result = 0, countFirst = 0, countSecond = 0;
    char first = pattern.charAt(0);
    char second = pattern.charAt(1);

    for (char ch : text.toCharArray()) {
        if (ch == second) {
            result += countFirst;
            countSecond++;
        }
        if (ch == first) {
            countFirst++;
        }
    }

    return result + Math.max(countFirst, countSecond);
}

}