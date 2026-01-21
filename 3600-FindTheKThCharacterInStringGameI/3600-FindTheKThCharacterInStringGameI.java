// Last updated: 21/01/2026, 11:56:09
class Solution {
    public char kthCharacter(int k) {
        return (char) ('a' + Integer.bitCount(k - 1));
    }
}