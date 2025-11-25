class Solution {
    public int maxSumDivThree(int[] nums) {
        int dp[][] = new int[nums.length][3];
        for(int i[] : dp){
            Arrays.fill(i,-1);
        }
        return fun(nums,0,0,dp);
    }
    public int fun(int nums[], int i , int rem ,int dp[][] ){
        if(i == nums.length && rem % 3 == 0) return 0;
        if(i >= nums.length){
            return Integer.MIN_VALUE/2;
        }
        if(dp[i][rem] != -1 ) return dp[i][rem];
        int ans = 0;
        int op1 = nums[i]+fun(nums, i+1, (rem+nums[i])% 3 , dp);
        int op2 = fun(nums, i+1, rem , dp);
        ans = Math.max(op1, op2);
        return dp[i][rem] = ans;
    }
}