class Solution {
    public int findChampion(int[][] grid) {
        int max = 0;
        int ans = -1;
        for(int i = 0 ; i < grid.length ; i++){
            int count = 0;
            for(int j = 0 ; j < grid[i].length ; j++){
                if(grid[i][j] == 1) count++;
            }
            if(count > max){
                max = count;
                ans = i;
            }
        }
        return ans;
    }
}