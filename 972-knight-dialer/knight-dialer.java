class Solution {
    int r[] = {2, 2,-2 , -2,1, -1 ,1, -1};
    int c[] = {1,-1, 1, -1,2,2, -2 , -2};
    char arr[][] = {{'1','2','3'},{'4','5','6'},{'7','8','9'},{'*','0','*'}};
    int MOD = 1000000007;
    Integer[][][] dp;
    public int knightDialer(int n) {
       long ans = 0;
       dp = new Integer[n][4][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] != '*') {
                    ans = (ans + fun(n - 1, i, j)) % MOD;
                }
            }
        }
        return (int) ans;
    }

    public int fun(int rem, int cr, int cc) {
        if (cr < 0 || cr >= arr.length || cc < 0 || cc >= arr[0].length || arr[cr][cc] == '*')          return 0;
        if (rem == 0) return 1;
        if (dp[rem][cr][cc] != null) return dp[rem][cr][cc];
        long res = 0;
        for (int i = 0; i < 8; i++) {
            res = (res + fun(rem - 1, cr+r[i], cc+c[i])) % MOD;
        }
        return  dp[rem][cr][cc] = (int) res;
    } 
}