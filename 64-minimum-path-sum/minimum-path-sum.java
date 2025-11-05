class Solution {
    public int minPathSum(int[][] grid) {
        int dp[][] = new int[grid.length][grid[0].length];
        for(int i[]:dp){
            Arrays.fill(i , -1);
        }
        return fun(grid, 0 , 0 , dp);
    }
    public int fun(int grid[][] , int cr , int cc , int dp[][]){
        if(cc >= grid[0].length || cr >= grid.length){
            return Integer.MAX_VALUE;
        }
        if(cc == grid[0].length-1 && cr == grid.length-1){
            return grid[cr][cc];
        }
        if(dp[cr][cc]!= -1){
            return dp[cr][cc];
        }
        int d = fun(grid, cr + 1, cc,dp);
        int r = fun(grid, cr, cc + 1,dp);
        return dp[cr][cc] = Math.min(d, r) + grid[cr][cc];
    }
}