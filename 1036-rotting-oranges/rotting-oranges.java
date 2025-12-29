class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans = 0;
        int fresh = 0;
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 2) q.offer(new int[]{i , j});
                if(grid[i][j] == 1) fresh++;
            }
        }
        int [][]dir = {{1,0},{0,1},{0,-1},{-1,0}};
        while(!q.isEmpty() && fresh > 0){
            int s = q.size();
            for(int k = 0; k < s; k++){
                int cur[] = q.poll();
                for(int []d : dir){
                    int ni = cur[0]+d[0];
                    int nj = cur[1]+d[1];
                    if(ni >= 0 && nj >= 0 && ni < n && nj < m && grid[ni][nj] == 1){
                        fresh--;
                        grid[ni][nj] = 2;
                        q.offer(new int[]{ni, nj});
                    }
                }
            }
            ans++;
        }
        if(fresh == 0) return ans;
        return -1;
    }
}