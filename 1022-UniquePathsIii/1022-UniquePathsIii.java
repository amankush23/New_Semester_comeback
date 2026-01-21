// Last updated: 21/01/2026, 11:59:22
class Solution {
    int res = 0;
    int empty = 1;

    public int uniquePathsIII(int[][] grid) {
        int startX = 0, startY = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) empty++;
                else if (grid[i][j] == 1) {
                    startX = i;
                    startY = j;
                }
            }
        }
        backtrack(grid, startX, startY, 0);
        return res;
    }

    private void backtrack(int[][] grid, int x, int y, int count) {
        if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] == -1) {
            return;
        }
        if (grid[x][y] == 2) {
            if (count == empty) {
                res++;
            }
            return;
        }
        int temp = grid[x][y];
        grid[x][y] = -1;
        backtrack(grid, x + 1, y, count + 1);
        backtrack(grid, x - 1, y, count + 1);
        backtrack(grid, x, y + 1, count + 1);
        backtrack(grid, x, y - 1, count + 1);
        grid[x][y] = temp;
    }
}
