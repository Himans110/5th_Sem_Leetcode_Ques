class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int safe = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 2) q.add(new int[]{i,j});
                else if(grid[i][j] == 1) safe++;
            }
        }
        int time = 0;
        int [][]dir = {{0,-1},{0,1},{1,0},{-1,0}};
        while(!q.isEmpty() && safe > 0){
            int p = q.size();
            for(int i = 0; i < p; i++){
                int cur[]= q.poll();
                for(int d = 0; d < dir.length; d++){
                    int ni = cur[0]+dir[d][0];
                    int nc = cur[1]+dir[d][1];
                    if(ni>=0 && nc>=0 && ni<n && nc<m && grid[ni][nc]==1){
                        grid[ni][nc] = 2;
                        safe--;
                        q.add(new int[]{ni,nc});
                    }
                }
            }
            time++;
        }

        return safe == 0 ? time : -1;
    }
}