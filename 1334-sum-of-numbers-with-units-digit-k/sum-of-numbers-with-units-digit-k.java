class Solution {
    public int minimumNumbers(int num, int k) {
        if (num == 0) return 0;
        int[] dp = new int[num + 1];
        Arrays.fill(dp, -1);
        int res = fun(num, k, dp);
        return res == Integer.MAX_VALUE ? -1 : res;
    }
    public int fun(int num, int k, int[] dp) {
        if (num < 0) return Integer.MAX_VALUE;
        if (num == 0) return 0;
        if (dp[num] != -1) return dp[num];
        int ans = Integer.MAX_VALUE;
        for (int val = k; val <= num; val += 10) {
            if (val == 0) continue;
            int sub = fun(num - val, k, dp);
            if (sub != Integer.MAX_VALUE) {
                ans = Math.min(ans, sub + 1);
            }
        }
        return dp[num] = ans;
    }
}
