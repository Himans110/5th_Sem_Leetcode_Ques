class Solution {
    public int cherryPickup(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int dp[][][] = new int[n][m][m];
        for(int outer2[][] : dp){
            for(int outer[] : outer2){
                Arrays.fill(outer,Integer.MIN_VALUE);
            }
        }
        return fun(grid, 0,0,m-1, dp, n , m);
    }
    public int fun(int arr[][] , int i, int j1, int j2 , int dp[][][], int n , int m){
        if (i < 0 || i >= n || j1 < 0 || j1 >= m || j2 < 0 || j2 >= m){
            return  Integer.MIN_VALUE;
        }
        if(i == n-1){
            if(j1 == j2){
                return arr[i][j1];
            }
            else return arr[i][j1]+arr[i][j2];
        }
        if(dp[i][j1][j2] != Integer.MIN_VALUE) return dp[i][j1][j2];
        
        int val = 0;
        if(j1 == j2) val+= arr[i][j1];
        else val += arr[i][j1]+arr[i][j2];
        int max = Integer.MIN_VALUE;

        for(int k = -1;k<=1;k++){
            for(int j = -1;j<= 1;j++){
                int temp = fun(arr,i+1,j1+k,j2+j,dp,n ,m);
                max = Math.max(temp,max);
            }
        }

        return dp[i][j1][j2] = max+ val; 
    }
}