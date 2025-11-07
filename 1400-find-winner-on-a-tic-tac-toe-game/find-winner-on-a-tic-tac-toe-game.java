class Solution {
    public String tictactoe(int[][] moves) {
        char arr[][] = new char[3][3];
        for(int i = 0 ; i < moves.length ; i++){
            if(i % 2 == 0){
                arr[moves[i][0]][moves[i][1]] = 'X';
            }
            else{
                arr[moves[i][0]][moves[i][1]] = 'O';
            }
        }
        int rowA = 0;
        int columnA = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char row = arr[i][j];
                char col = arr[j][i];
                if (row == 'X') {
                    rowA++;
                } else if (row == 'O') {
                    rowA--;
                }
                if (col == 'X') {
                    columnA++;
                } else if (col == 'O') {
                    columnA--;
                }
            }
            if (rowA == 3 || columnA == 3) {
                return "A";
            } else if (rowA == -3 || columnA == -3) {
                return "B";
            }
            rowA = 0;
            columnA = 0;
        }
        if (checkDiag(arr, 'X')) {
            return "A";
        }
        if (checkDiag(arr, 'O')) {
            return "B";
        }
        return moves.length == 9 ? "Draw" : "Pending";
    }

    private boolean checkDiag(char[][] board, char ch) {
        return (board[0][0] == ch && board[1][1] == ch && board[2][2] == ch) ||
                (board[0][2] == ch && board[1][1] == ch && board[2][0] == ch);   
    }
}