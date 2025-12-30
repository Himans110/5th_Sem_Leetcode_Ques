class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        Queue<int []> q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(mat[i][j] == 0){
                    q.add(new int[]{i, j});
                }
                else{
                    mat[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        int dir[][] = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int cur[] = q.poll();
            for(int d[] : dir){
                int ni = cur[0]+d[0];
                int nj = cur[1]+d[1];
                if(ni >= 0 && nj >= 0 && ni < n && nj < m && mat[ni][nj] > mat[cur[0]][cur[1]]){
                    mat[ni][nj] = mat[cur[0]][cur[1]]+1;
                    q.add(new int[]{ni,nj});
                }
            }
        }
        return mat;
    }
}