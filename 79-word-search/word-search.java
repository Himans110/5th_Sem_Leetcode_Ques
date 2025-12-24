class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i = 0 ; i< board.length ; i++){
            for(int j = 0 ; j< board[0].length ; j++){
                if(board[i][j] == word.charAt(0)){
                    if(fun(board,i,j ,word, 0)) return true;
                }
            }
        }
        return false;
    }
    public boolean fun(char board[][], int cr, int cc, String word, int idx){
        if(idx == word.length()){
            return true;
        }
        if(cr < 0 || cc <0 ||cr >= board.length || cc >= board[0].length || board[cr][cc] != word.charAt(idx)) return false;
        int r[] = {0, -1 , 0 , 1};
        int c[] = {1, 0, -1, 0};
        board[cr][cc] = '*';
        for(int i = 0 ; i < 4 ; i++){
            boolean ans = fun(board, cr+r[i], cc+c[i], word, idx+1);
            if(ans == true) return true;
        }
        board[cr][cc] = word.charAt(idx);
        return false;
    }
}