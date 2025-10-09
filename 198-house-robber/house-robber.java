class Solution {
    public int rob(int[] nums) {
       int []dp = new int[nums.length];
       Arrays.fill(dp,-1);
       return fun(nums, dp , 0); 
    }
    public int fun(int []nums, int []dp , int i){
        if(i >= nums.length){
            return 0;
        }
        if(dp[i] != -1) return dp[i];
        int rob = nums[i]+fun(nums, dp, i+2);
        int dont = fun(nums, dp , i+1);
        return dp[i] = Math.max(rob,dont);
    }
}