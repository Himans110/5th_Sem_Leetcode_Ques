class Solution {
    int r[] = {1, 0 , 0  , -1};
    int c[] = {0, 1 , -1 , 0};
    public int longestIncreasingPath(int[][] arr) {
        int dp[][] = new int[arr.length][arr[0].length];
        int ans = 0;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                ans = Math.max(ans, fun(arr, dp, i , j));
            }
        }
        return ans;
    }
    public int fun(int arr[][] , int dp[][] , int i , int j){
        if(dp[i][j] != 0) return dp[i][j];
        int ans = 1;
        for(int k = 0 ; k < 4 ; k++){
            int x = i + r[k];
            int y = j + c[k];
            if (x >= 0 && x < arr.length && y >= 0 && y < arr[0].length 
                && arr[x][y] > arr[i][j]) {
                ans = Math.max(ans, 1 + fun(arr, dp, x, y));
            }
        }
        dp[i][j] = ans;
        return ans;
    }
}