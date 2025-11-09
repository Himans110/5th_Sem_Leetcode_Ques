class Solution {
    Integer[][][] dp;
    int m;
    int n;
    public int maxPathScore(int[][] grid, int k) {
         m = grid.length;
         n = grid[0].length;
         dp = new Integer[m+1][n+1][k+1];
         int max = solve(grid, 0, 0, k);  
        return max == Integer.MIN_VALUE ? -1 : max;
    }

    public int solve(int[][] grid, int x, int y, int k) {
        if (x >= m || y >= n || k < 0) return Integer.MIN_VALUE;
        
        if (dp[x][y][k] != null) return dp[x][y][k];
        
        int cost = grid[x][y] == 0 ? 0 : 1;
        int newk = k - cost;

        if (x == m - 1 && y == n - 1) {
            if (newk < 0) return Integer.MIN_VALUE;
            return grid[x][y];
        }

        int down = solve(grid, x + 1, y, newk);
        int right = solve(grid, x, y + 1, newk);
        
        int best = Math.max(down, right);
        
        if (best == Integer.MIN_VALUE) {
            dp[x][y][k] = Integer.MIN_VALUE;
        } else {
            dp[x][y][k] = grid[x][y] + best;
        }
        return dp[x][y][k];
    }

    
}