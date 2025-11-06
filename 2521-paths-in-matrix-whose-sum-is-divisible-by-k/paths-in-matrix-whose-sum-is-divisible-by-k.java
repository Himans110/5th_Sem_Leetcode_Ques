class Solution {
    public int numberOfPaths(int[][] grid, int k) {
        int dp[][][] = new int[grid.length][grid[0].length][k];
        for(int i =0 ; i < dp.length ; i++){
            for(int j = 0 ; j < dp[0].length ; j++){
                for(int l = 0 ; l < dp[0][0].length ; l++){
                    dp[i][j][l] = -1;
                }
            }
        }
        return fun(grid,0,0, k, 0, dp);
    }
    public int fun(int arr[][], int cr , int cc , int k, int sum, int dp[][][]){
        if(cr >= arr.length || cc >= arr[0].length) return 0;
        if(dp[cr][cc][sum%k] != -1) return dp[cr][cc][sum%k];
        if(cr == arr.length-1 && cc==arr[0].length-1){
            sum+=arr[cr][cc];
            if(sum % k == 0) return 1;
            else return 0;
        }
        int d = fun(arr, cr+1, cc, k, sum+arr[cr][cc], dp);
        int r = fun(arr, cr, cc+1, k, sum+arr[cr][cc], dp);
        return dp[cr][cc][sum%k] = (d+r)%1000000007;
    }
}