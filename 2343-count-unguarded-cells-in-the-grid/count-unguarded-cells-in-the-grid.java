class Solution 
{
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls){ 
        int[][] grid = new int[m][n];
        for (int[] g : guards)
        {
            grid[g[0]][g[1]] = 2;
        } 
        for (int[] w : walls)
        {
            grid[w[0]][w[1]] = 2;
        } 
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};
        for(int g[] : guards){
            int gr = g[0], gc = g[1];
            for(int i = 0 ; i < 4 ; i++){
                int r = gr+dr[i], c = gc+dc[i];
                while(r>= 0 && r < m && c >= 0 && c < n && grid[r][c] < 2){
                    grid[r][c] = 1;
                    r += dr[i];
                    c += dc[i];
                }
            }
        }
        int count = 0;
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (grid[i][j] == 0) count++;
            }
        }
        return count;
    }
}