class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        int [][]dp = new int[arr.length][arr[0].length];
        for(int i[] : dp){
            Arrays.fill(i,-1);
        }
        return fun(arr, 0 ,0 , dp);
    }
    public int fun(int arr[][] , int cr , int cc , int [][]dp){
        if(cr >= arr.length || cc >= arr[0].length) return 0;
        if(arr[cr][cc] == 1) return 0;
        if(cr == arr.length-1 && cc == arr[0].length-1) return 1;
        if(dp[cr][cc] != -1) return dp[cr][cc];
        int d = fun(arr, cr+1 , cc , dp);
        int r = fun(arr, cr , cc+1 , dp);
        return dp[cr][cc] = d+r;
    }
}