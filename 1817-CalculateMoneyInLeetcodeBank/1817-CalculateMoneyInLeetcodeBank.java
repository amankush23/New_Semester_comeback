// Last updated: 21/01/2026, 11:58:04
class Solution {
    public int totalMoney(int n) {
        int weeks = n / 7;
        int days = n % 7;
        int total = 0;

        total += (weeks * 28);
        total += (7 * (weeks * (weeks - 1)) / 2);

        int start = weeks + 1;
        for (int i = 0; i < days; i++) {
            total += (start + i);
        }

        return total;
    }
}
