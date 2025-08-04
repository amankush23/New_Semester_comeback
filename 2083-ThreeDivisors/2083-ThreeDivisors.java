// Last updated: 8/4/2025, 11:10:07 PM
class Solution {
    public boolean isThree(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
            if (count > 3) {
                return false;
            }
        }
        return count==3;
        }
}