// Last updated: 8/4/2025, 11:10:20 PM
class Solution {
    public int maximumWealth(int[][] accounts) {
        return Ameerzyada(accounts);
    }
    public static int Ameerzyada(int[][] acnt) {
        int maxWealth = 0;
        for (int i = 0; i < acnt.length; i++) {
            int currentWealth = 0;
            for (int j = 0; j < acnt[i].length; j++) {
                currentWealth += acnt[i][j];
            }
            if (currentWealth > maxWealth) {
                maxWealth = currentWealth;
            }
        }
        return maxWealth;
    }
}