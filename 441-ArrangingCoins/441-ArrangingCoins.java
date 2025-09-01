// Last updated: 9/1/2025, 11:44:43 PM
class Solution {
    public int arrangeCoins(int n) {
        return (int) (Math.sqrt(8 * (long)n + 1) - 1)/2;
    }
}