class Solution {
    public boolean canJump(int[] nums) {
        Boolean dp[] = new Boolean[nums.length];
        return find(nums, dp, 0);
    }
    public boolean find(int nums[], Boolean dp[], int i){
        if(i  >= nums.length-1) return true;
        if(dp[i] != null) return dp[i];
        int max = nums[i];
        boolean ans = false;
        for(int jump = 1; jump <= max; jump++){
            ans =  find(nums, dp, jump+i);
            if(ans) return true;
        }
        return dp[i] = ans;
    }
}