class Solution {
    int[] row = {1, -1, 0, 0};
    int[] col = {0, 0, -1, 1};
    int maxGold = 0;
    public int getMaximumGold(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] != 0) {
                    maxGold = Math.max(maxGold, dfs(grid, i, j));
                }
            }
        }
        return maxGold;
    }
    public int dfs(int grid[][], int x , int y){
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == 0) return 0;
        int curr = grid[x][y];
        grid[x][y] = 0;
        int max = curr;
        for(int i = 0 ; i < 4 ; i++){
            max = Math.max(max, curr+dfs(grid, x+row[i], y+col[i]));
        }
        grid[x][y] = curr;
        return max;
    }
}