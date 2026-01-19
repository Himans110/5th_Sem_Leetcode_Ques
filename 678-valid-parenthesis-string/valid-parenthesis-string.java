class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();
        int[][][] dp = new int[n + 1][n + 1][n + 1];
        for (int i = 0; i <= n; i++){
            for (int j = 0; j <= n; j++){
                Arrays.fill(dp[i][j], -1);
            }
        }
        return fun(s, 0, 0, 0, dp);
    }
    public boolean fun(String s, int idx, int op, int cl, int[][][] dp) {
        if (cl > op) return false;
        if (idx == s.length()) return op == cl;
        if (dp[idx][op][cl] != -1) return dp[idx][op][cl] == 1;
        boolean res;
        char ch = s.charAt(idx);
        if (ch == '(') {
            res = fun(s, idx + 1, op + 1, cl, dp);
        }
        else if (ch == ')') {
            res = fun(s, idx + 1, op, cl + 1, dp);
        }
        else {
            res =
                fun(s, idx + 1, op + 1, cl, dp) || 
                fun(s, idx + 1, op, cl + 1, dp) || 
                fun(s, idx + 1, op, cl, dp);     
        }
        dp[idx][op][cl] = res ? 1 : 0;
        return res;
    }
}
