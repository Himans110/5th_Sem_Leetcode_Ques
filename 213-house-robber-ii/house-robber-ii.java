class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        Integer[] dp1 = new Integer[n];
        Integer[] dp2 = new Integer[n];
        return Math.max(fun(nums, 0, n - 2, dp1), fun(nums, 1, n - 1, dp2));
    }

    private int fun(int[] nums, int idx, int end, Integer[] dp) {
        if (idx > end) return 0;
        if (dp[idx] != null) return dp[idx];
        int take = nums[idx] + fun(nums, idx + 2, end, dp);
        int notTake = fun(nums, idx + 1, end, dp);
        return dp[idx] = Math.max(take, notTake);
    }    
}