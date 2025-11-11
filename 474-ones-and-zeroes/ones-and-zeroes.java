class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int k = strs.length;
        int[] ones = new int[k];
        int[] zeros = new int[k];
        for (int i = 0; i < k; i++) {
            int co = 0, c1 = 0;
            for (char c : strs[i].toCharArray()) {
                if (c == '0') co++;
                else c1++;
            }
            zeros[i] = co;
            ones[i] = c1;
        }
        int[][][] dp = new int[k][m + 1][n + 1];
        for (int[][] layer : dp) {
            for (int[] row : layer) {
                Arrays.fill(row, -1);
            }
        }
        return helper(zeros, ones, m, n, 0, dp);
    }

    private int helper(int[] zeros, int[] ones, int m, int n, int i, int[][][] dp) {
        if (i == zeros.length) return 0;
        if (dp[i][m][n] != -1) return dp[i][m][n];
        int not = helper(zeros, ones, m, n, i + 1, dp);
        int take = 0;
        if (zeros[i] <= m && ones[i] <= n) {
            take = 1 + helper(zeros, ones, m - zeros[i], n - ones[i], i + 1, dp);
        }
        return dp[i][m][n] = Math.max(take, not);
    }
}
