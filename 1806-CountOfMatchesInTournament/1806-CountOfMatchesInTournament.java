// Last updated: 8/4/2025, 11:10:17 PM
class Solution {
    public int numberOfMatches(int n) {
         int matches = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                matches += n / 2;
            } else {
                matches += (n - 1) / 2 + 1;
            }
            n /= 2;
        }
        return matches;
        }
}