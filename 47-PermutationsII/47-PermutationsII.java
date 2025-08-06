// Last updated: 8/6/2025, 11:20:58 PM
class Solution {
    public int totalNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        return countSolutions(board, 0);
    }

    public int countSolutions(boolean[][] board, int row) {
        if (row == board.length) {
            return 1; // one valid way found
        }

        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (isItsSafe(board, row, col)) {
                board[row][col] = true;
                count += countSolutions(board, row + 1);
                board[row][col] = false; // backtrack
            }
        }
        return count;
    }

    public boolean isItsSafe(boolean[][] board, int row, int col) {
        // check vertically up
        for (int r = row - 1; r >= 0; r--) {
            if (board[r][col]) return false;
        }

        // check upper-left diagonal
        for (int r = row - 1, c = col - 1; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c]) return false;
        }

        // check upper-right diagonal
        for (int r = row - 1, c = col + 1; r >= 0 && c < board.length; r--, c++) {
            if (board[r][c]) return false;
        }

        return true;
    }
}
