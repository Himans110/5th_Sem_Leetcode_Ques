class Solution {
    int dp[][] = new int[301][301];
    int mod = 1000000007;
    public int numberOfWays(int n, int x) {
        for(int i = 0 ; i < 301; i++){
            Arrays.fill(dp[i], -1);
        }
        return solve(n, 1, x);
    }
    public int solve(int n , int base, int x){
        if(n == 0) return 1;
        if(n < 0) return 0;

        int val = (int)Math.pow(base, x);
        if(val > n) return 0;

        if(dp[n][base] != -1) return dp[n][base];

        int take = solve(n-val, base+1, x);
        int not = solve(n, base+1, x);
        return dp[n][base] = (take+not) % mod;
    }
}