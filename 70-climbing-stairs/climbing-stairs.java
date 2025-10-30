class Solution {
    public int climbStairs(int n) {
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        return fun(n , 0, dp);
    }
    public int fun(int n , int curr, int dp[]){
        if (curr == n) return 1;
        if (curr > n) return 0;
        if(dp[curr] != -1) return dp[curr];
        dp[curr] = fun(n, curr + 1 , dp) + fun(n, curr + 2, dp);
        return dp[curr];
    }
}