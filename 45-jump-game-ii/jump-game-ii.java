class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp , -1);
        return find(nums, dp, 0);
    }
    public int find(int nums[], int dp[], int i){
        if (i >= nums.length - 1) return 0;
        if (dp[i] != -1) return dp[i];
        int max = nums[i];
        int min = Integer.MAX_VALUE;
        for (int j = 1; j <= max; j++) {
            int next = find(nums, dp, i + j);
            if (next != Integer.MAX_VALUE) {
                min = Math.min(min, 1 + next);
            }
        }
        return dp[i] = min;
    }
}