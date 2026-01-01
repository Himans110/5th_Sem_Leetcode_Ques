class Solution {
    public int numEnclaves(int[][] grid) {
        int total = 0;
        int n = grid.length;
        int m = grid[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) total++;
            }
        }
        Queue<int[]> q = new LinkedList<>();
        // add boundary land
        for (int i = 0; i < n; i++) {
            if (grid[i][0] == 1) {
                q.add(new int[]{i, 0});
                grid[i][0] = 0;
            }
            if (grid[i][m - 1] == 1) {
                q.add(new int[]{i, m - 1});
                grid[i][m - 1] = 0;
            }
        }
        for (int j = 0; j < m; j++) {
            if (grid[0][j] == 1) {
                q.add(new int[]{0, j});
                grid[0][j] = 0;
            }
            if (grid[n - 1][j] == 1) {
                q.add(new int[]{n - 1, j});
                grid[n - 1][j] = 0;
            }
        }
        int count = 0;
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            count++;
            for (int[] d : dir) {
                int nr = cur[0] + d[0];
                int nc = cur[1] + d[1];
                if (nr >= 0 && nc >= 0 && nr < n && nc < m && grid[nr][nc] == 1) {
                    grid[nr][nc] = 0;
                    q.add(new int[]{nr, nc});
                }
            }
        }
        return total - count;
    }
}
