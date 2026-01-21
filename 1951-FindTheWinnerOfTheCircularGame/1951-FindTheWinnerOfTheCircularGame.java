// Last updated: 21/01/2026, 11:57:54
class Solution {
    public int findTheWinner(int n, int k) {
        int winner=0;
        for (int i = 1; i <= n; i++) {
            winner = (winner + k) % i;
        }
        return winner + 1;
    }
}