class Solution {
    static long mod = 1000000007;
    public int countHousePlacements(int n) {
        long dp[] = new long[n+1];
        Arrays.fill(dp, -1);
        long p = find(n , dp);
        long ans = (p * p) % mod;
        return (int) ans;
    }
    public long find(int n , long []dp){
        if(n == 0 ) return 1;
        if(n == 1) return 2;
        if(dp[n] != -1) return dp[n];

        dp[n] = (find(n-1 , dp)+ find(n-2 , dp)) % mod;
        return dp[n];
    }
}