// Last updated: 8/4/2025, 11:11:26 PM
class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) return false;

        int sum = 1; // 1 is always a divisor (except for 1 itself)

        // Check divisors up to sqrt(num)
        int limit = (int) Math.sqrt(num);
        for (int i = 2; i <= limit; i++) {
            if (num % i == 0) {
                sum += i;
                int otherDivisor = num / i;
                if (otherDivisor != i) {
                    sum += otherDivisor;
                }
            }
        }

        return sum == num;
    }
}
