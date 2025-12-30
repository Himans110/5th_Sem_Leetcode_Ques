class Solution {
    public char[][] solve(char[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            if(mat[i][0] == 'O'){
                q.add(new int[]{i , 0});
                mat[i][0] = '#';
            }
            if(mat[i][m-1] == 'O'){
                q.add(new int[]{i , m-1});
                mat[i][m-1] = '#';
            }
        }
        for(int j = 0 ; j < m ; j++){
            if(mat[0][j] == 'O'){
                q.add(new int[]{0 , j});
                mat[0][j] = '#';
            }
            if(mat[n-1][j] == 'O'){
                q.add(new int[]{n-1 , j});
                mat[n-1][j] = '#';
            }
        }
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int[] d : dir) {
                int ni = cur[0] + d[0];
                int nj = cur[1] + d[1];
                if (ni >= 0 && nj >= 0 && ni < n && nj < m && mat[ni][nj] == 'O') {
                    mat[ni][nj] = '#';
                    q.add(new int[]{ni, nj});
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 'O') mat[i][j] = 'X';
                else if (mat[i][j] == '#') mat[i][j] = 'O';
            }
        }
        return mat;
    }
}
