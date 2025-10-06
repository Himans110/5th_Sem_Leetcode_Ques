class Solution {
    public int uniquePaths(int m, int n) {
        int [][]dp = new int[m][n];
        return fun(m , n , 0 , 0, dp);
    }
    public int fun(int row , int col , int cr , int cc,int [][]dp){
        if(cr >= row || cc >= col){
            return 0;
        }
        if(cr == row-1 && cc == col-1 ) return 1;
        if(dp[cr][cc] != 0) return dp[cr][cc];
        int d = fun(row,col , cr+1, cc,dp);
        int r = fun(row , col , cr, cc+1,dp);
        return dp[cr][cc] = d+r;
    }
}