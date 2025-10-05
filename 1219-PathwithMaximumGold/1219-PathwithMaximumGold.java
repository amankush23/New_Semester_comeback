// Last updated: 10/5/2025, 10:34:07 PM
class Solution {
    public int getMaximumGold(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int maxGold = 0;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] != 0) {
                    maxGold = Math.max(maxGold, DFS(grid, i, j));
                }
            }
        }

        return maxGold;
    }

    int[][] directions = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
    public int DFS(int[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;
        if(i >= m || i < 0 || j >= n || j < 0 || grid[i][j] == 0) {
            return 0; 
        }

        int originalGoldValue = grid[i][j];
        grid[i][j] = 0;

        int maxGold = 0;
        for(int[] dir : directions) {
            int new_i = i + dir[0];
            int new_j = j + dir[1];

            maxGold = Math.max(maxGold, DFS(grid, new_i, new_j));
        }

        grid[i][j] = originalGoldValue;
        return originalGoldValue + maxGold;
    }
}