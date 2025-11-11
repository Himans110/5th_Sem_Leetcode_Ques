class Solution {
    int[][] dp;
    int total;

    public int helper(int[] nums, int target, int sum, int idx) {
        if (idx == nums.length) {
            return (sum == target) ? 1 : 0;
        }
        if (dp[idx][sum + total] != -1)
            return dp[idx][sum + total];
        int add = helper(nums, target, sum + nums[idx], idx + 1);
        int subtract = helper(nums, target, sum - nums[idx], idx + 1);
        return dp[idx][sum + total] = add + subtract;
    }

    public int findTargetSumWays(int[] nums, int target) {
        total = 0;
        for (int num : nums) total += num; 
        dp = new int[nums.length][2 * total + 1]; // range bcz -ve sum to +ve sum
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < 2 * total + 1; j++) {
                dp[i][j] = -1;
            }
        }
        return helper(nums, target, 0, 0);
    }
}
