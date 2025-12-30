class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        if (grid.length < 3 || grid[0].length < 3) return 0;
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        for (int i = 0; i <= n - 3; i++) {
            for (int j = 0; j <= m - 3; j++) {
                if (isposs(grid, i, j)) count++;
            }
        }
        return count;
    }

    public boolean isposs(int[][] grid, int si, int sj) {
        int ei = si + 2;
        int ej = sj + 2;
        boolean[] seen = new boolean[10];
        for (int i = si; i <= ei; i++) {
            for (int j = sj; j <= ej; j++) {
                int v = grid[i][j];
                if (v < 1 || v > 9 || seen[v]) return false;
                seen[v] = true;
            }
        }
        int sumr = 0;
        //row
        for (int i = si; i <= ei; i++) {
            int sum = 0;
            for (int j = sj; j <= ej; j++) {
                sum += grid[i][j];
            }
            if (i == si) sumr = sum;
            else if (sum != sumr) return false;
        }
        // col
        for (int j = sj; j <= ej; j++) {
            int sum = 0;
            for (int i = si; i <= ei; i++) {
                sum += grid[i][j];
            }
            if (sum != sumr) return false;
        }
        //Dia
        int dia1 = grid[si][sj]+grid[si+1][sj+1]+grid[si+2][sj+2]; 
        if(dia1 != sumr) return false; 
        int dia2 = grid[si][ej]+grid[si+1][ej-1]+grid[si+2][ej-2]; 
        if(dia2 != sumr) return false; 
        return true;
    }
}
