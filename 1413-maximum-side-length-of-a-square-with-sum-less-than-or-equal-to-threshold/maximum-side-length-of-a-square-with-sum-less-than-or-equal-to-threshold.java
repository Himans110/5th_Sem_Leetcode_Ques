class Solution {
    public int maxSideLength(int[][] mat, int t) {
        int m = mat.length , n = mat[0].length;
        int [][]pre = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                pre[i][j] = ((i > 0) ? pre[i-1][j] : 0 ) +
                            ((j > 0) ? pre[i][j-1] : 0 ) -
                            ((i > 0 && j > 0) ? pre[i-1][j-1] : 0) + 
                            mat[i][j];
            }
        }
        int ans = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                // offset ka for loop
                for(int k = 0 ; k < Math.min(m-i,n-j); k++){
                    int r2 = i+k;
                    int c2 = j+k;
                    int sum = findsum(pre, i , j , r2 , c2);
                    if(sum <= t){
                        ans = Math.max(ans , k+1); // k+1 -> sides
                    }
                    else break;
                }
            }
        }
        return ans;
    }
    public int findsum(int pre[][] , int i , int j ,int r2 , int c2){
        int sum = pre[r2][c2];
        if(i > 0) sum -= pre[i-1][c2];
        if(j > 0) sum -= pre[r2][j-1];
        if(i > 0 && j > 0) sum += pre[i-1][j-1];
        return sum;
    }
}