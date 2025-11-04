class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for(int i[] : dp){
            Arrays.fill(i , -1);
        }
        return fun(m,n , 0 , 0, dp);
    }
    public int fun(int m , int n , int cr , int cc , int dp[][]){
        if(cr == m-1 && cc  == n-1) return 1;
        if(cr >=m || cc >= n) return 0;
        if(dp[cr][cc] != -1 )  return dp[cr][cc];
        int d= fun(m , n , cr+1 , cc, dp);
        int r = fun(m , n , cr , cc+1 , dp);
        return dp[cr][cc] = d+r;
    }
}