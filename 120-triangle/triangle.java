class Solution {
    public int minimumTotal(List<List<Integer>> t) {
        int n = t.size();
        int dp[][] = new int[n][n];
        for(int i[]:dp){
            Arrays.fill(i , Integer.MIN_VALUE);
        }
        return fun(t, 0 , 0 , dp);
    }
    public int fun(List<List<Integer>> t , int cr , int cc , int dp[][]){
       int n = t.size();
        if (cr == n - 1) {
            return t.get(cr).get(cc);
        }
        if (dp[cr][cc] != Integer.MIN_VALUE) {
            return dp[cr][cc];
        }
        int down = fun(t, cr + 1, cc, dp);
        int diag = fun(t, cr + 1, cc + 1, dp);
        return dp[cr][cc] = t.get(cr).get(cc) + Math.min(down, diag);
    
    }
}