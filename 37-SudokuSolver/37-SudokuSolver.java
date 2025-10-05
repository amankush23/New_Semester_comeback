// Last updated: 10/5/2025, 3:06:03 PM
class Solution {
    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }

    private boolean solve(char[][] board, int row, int col) {
        if (col == 9) {
            row++;
            col = 0;
        }
        if (row == 9) {
            return true;
        }

        if (board[row][col] != '.') {
            return solve(board, row, col + 1);
        } else {
            for (char val = '1'; val <= '9'; val++) {
                if (isSafe(board, row, col, val)) {
                    board[row][col] = val;
                    if (solve(board, row, col + 1)) {
                        return true;
                    }
                    board[row][col] = '.'; // backtrack
                }
            }
        }
        return false;
    }

    private boolean isSafe(char[][] board, int row, int col, char val) {
        // check row & col
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == val || board[i][col] == val) {
                return false;
            }
        }

        // check 3x3 subgrid
        int r = row - row % 3;
        int c = col - col % 3;
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (board[i][j] == val) {
                    return false;
                }
            }
        }

        return true;
    }
}
