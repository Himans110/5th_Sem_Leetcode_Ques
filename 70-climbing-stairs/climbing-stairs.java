class Solution {
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp , -1);
        return fun(n, 0 , dp);
    }
    public int fun(int n , int cur, int dp[]){
        if(cur == n) return 1;
        if(cur > n) return 0;
        if(dp[cur] != -1) return dp[cur];
        int ans = fun(n , cur+1, dp)+fun(n , cur+2, dp);
        return dp[cur] = ans;
    }
}