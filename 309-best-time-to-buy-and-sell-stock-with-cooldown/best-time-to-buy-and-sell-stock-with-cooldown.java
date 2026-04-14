class Solution {
    public int maxProfit(int[] nums) {
        int dp[][] = new int[nums.length][2];
        for(int d[] : dp){
            Arrays.fill(d , -1);
        }
        return solve(nums, 0, 1, dp);
    }

    public int solve(int nums[], int i , int buy, int dp[][]){
        if(i >= nums.length){
            return 0;
        }
        if(dp[i][buy] != -1) return dp[i][buy];
        int pro = 0;
        if(buy == 1){
            // buy
            int take = -nums[i] + solve(nums, i+1, 0, dp);
            // skip
            int not = solve(nums, i+1, 1 , dp);
            pro = Math.max(take, not);
        }
        else{
            // buy
            int take = nums[i] + solve(nums, i+2, 1, dp); // cooldown
            // skip
            int not = solve(nums, i+1, 0, dp);
            pro = Math.max(take, not);
        }
        return dp[i][buy] = pro;
    }
}