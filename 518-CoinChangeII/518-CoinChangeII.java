// Last updated: 9/4/2025, 12:40:49 AM
class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[amount + 1][coins.length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
        return Coin_Change(coins, amount, 0, dp);
    }
    public static int Coin_Change(int[] coins, int amount, int idx, int[][] dp) {
		if (amount == 0) {
			return 1;
		}
		if (idx == coins.length) {
			return 0;
		}
		if (dp[amount][idx] != -1) {
			return dp[amount][idx];
		}
		int inc = 0, exc = 0;
		if (amount >= coins[idx]) {
			inc = Coin_Change(coins, amount - coins[idx], idx, dp);
		}
		exc = Coin_Change(coins, amount, idx + 1, dp);
		return dp[amount][idx] = exc + inc;
	}
}