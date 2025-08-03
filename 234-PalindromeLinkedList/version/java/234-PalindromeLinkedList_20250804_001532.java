// Last updated: 8/4/2025, 12:15:32 AM
class Solution {
    public int addDigits(int num) {
        return (num == 0) ? 0 : (num % 9 == 0 ? 9 : num % 9);

    }
}