class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int ans = 0;
        for(int i = 0 ;i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length ; j++){
                if(grid[i][j]==1){
                   int a =  fun(grid,i,j);
                   ans = Math.max(a,ans);
                }
            }
        }
        return ans;
    }
    public int fun(int grid[][],int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0) return 0;
        grid[i][j] = 0;
        int ans = 0;
        ans = 1+fun(grid,i+1,j)+fun(grid,i,j+1)+fun(grid,i-1,j)+fun(grid,i,j-1);
        return ans;
    }
}