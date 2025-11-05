class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int dp[][] = new int[matrix.length][matrix[0].length];
        for(int i [] : dp){
            Arrays.fill(i, 105);
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < matrix.length ; i++){
            ans = Math.min(ans, fun(matrix,0,i ,dp));
        }
        return ans;
    }
    public int fun(int matrix[][] , int cr, int cc, int dp[][]){
        if (cr >= matrix.length || cc < 0 || cc >= matrix[0].length) {
            return Integer.MAX_VALUE;
        }
        if(cr == matrix.length-1){
            return matrix[cr][cc];
        }
        if(dp[cr][cc] != 105) return dp[cr][cc];
        int l =fun(matrix, cr+1, cc-1, dp);
        int s = fun(matrix, cr+1, cc, dp);
        int r = fun(matrix, cr+1, cc+1 , dp);
        int minBelow = Math.min(l, Math.min(s, r));
        if (minBelow == Integer.MAX_VALUE) return matrix[cr][cc];
        return dp[cr][cc] = matrix[cr][cc] + minBelow;
    }
}