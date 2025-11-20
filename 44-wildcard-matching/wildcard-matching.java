class Solution {
    public boolean isMatch(String s, String p) {
        int n = s.length(), m = p.length();
        Boolean[][] dp = new Boolean[n][m]; 
        return helper(s, p, n - 1, m - 1, dp);
    }
    public boolean helper(String s, String p, int i, int j, Boolean[][] dp) {
        if (i < 0 && j < 0) return true;
        if (j < 0 && i >= 0) return false;
        if (i < 0 && j >= 0) {
            for (int jj = 0; jj <= j; jj++) {
                if (p.charAt(jj) != '*') return false;
            }
            return true;
        }
        if (dp[i][j] != null) return dp[i][j];
        boolean ans;
        if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?') {
            ans = helper(s, p, i - 1, j - 1, dp);
        }
        else if (p.charAt(j) == '*') {
            ans = helper(s, p, i - 1, j, dp) || helper(s, p, i, j - 1, dp);
        }
        else {
            ans = false; 
        }
        return dp[i][j] = ans;
    }
}
