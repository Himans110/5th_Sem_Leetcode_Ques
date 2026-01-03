class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i : nums){sum += i;}
        if(sum%2!=0) return false;
        Boolean[][] dp = new Boolean [nums.length][(sum/2)+1];
        return fun(nums, 0, sum/2, dp);
    }
    public boolean fun(int nums[], int idx , int target, Boolean [][]dp){
        if(target == 0) return true;
        if(idx >= nums.length || target<0) return false;
        if(dp[idx][target] != null) return dp[idx][target];
        boolean pick = fun(nums, idx+1, target-nums[idx] , dp);
        boolean not = fun(nums, idx+1, target, dp);
        return dp[idx][target] = pick||not;
    }
}