class Solution {
    public int getMaximumGold(int[][] grid) {
        int ans = 0;
        int n = grid.length, m = grid[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] != 0) {
                    ans = Math.max(ans, fun(grid, i, j));
                }
            }
        }
        return ans;
    }
    public int fun(int[][] grid,int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0){
            return 0;
        }
        int v=grid[i][j];
        grid[i][j]=0;
        int ans=0;
        ans=Math.max(ans,fun(grid,i+1,j));
        ans=Math.max(ans,fun(grid,i,j+1));
        ans=Math.max(ans,fun(grid,i-1,j));
        ans=Math.max(ans,fun(grid,i,j-1));
        grid[i][j]=v;
        return ans+v;
    }
}