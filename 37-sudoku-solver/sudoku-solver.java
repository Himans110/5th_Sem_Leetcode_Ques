class Solution {
    public void solveSudoku(char[][] board) {
        SudokuSolver(board, 0, 0);
    }
    private boolean SudokuSolver(char[][] board, int row, int col) {
        if (col == 9) {
            row++;
            col = 0;
        }
        if (row == 9) {
            return true;
        }
        if (board[row][col] != '.') {
            return SudokuSolver(board, row, col + 1);
        }
        for (char val = '1'; val <= '9'; val++) {
            if (isValid(board, row, col, val)) {
                board[row][col] = val;
                if (SudokuSolver(board, row, col + 1)) {
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;
    }

    private boolean isValid(char[][] board, int row, int col, char val) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == val || board[i][col] == val || 
                board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == val) {
                return false;
            }
        }
        return true;
    }
}