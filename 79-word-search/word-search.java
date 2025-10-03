class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                if(board[i][j] == word.charAt(0)){
                    if(ispossible(board, word, i, j , 0)) return true;
                }
            }
        }
        return false;
    }
    public boolean ispossible(char board[][] , String word , int cr, int cc , int idx){
        if(idx == word.length()) return true;
        if(cr < 0 || cr >= board.length || cc < 0 || cc >= board[0].length || board[cr][cc] != word.charAt(idx)) return false;
        board[cr][cc] = '*';
        int r[] = {0, -1 , 0 , 1};
        int c[] = {1, 0, -1, 0};
        for(int k = 0 ; k < c.length ; k++){
            boolean ans = ispossible(board, word, cr+r[k], cc+c[k], idx+1);
           if(ans == true){
                return true;
            }
        }
        board[cr][cc] = word.charAt(idx);
        return false;
    }
}