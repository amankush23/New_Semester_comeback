// Last updated: 9/1/2025, 11:39:37 PM
class Solution {
    public char kthCharacter(int k) {
        return (char) ('a' + Integer.bitCount(k - 1));
    }
}