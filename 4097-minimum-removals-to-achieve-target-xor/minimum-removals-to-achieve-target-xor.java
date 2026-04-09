class Solution {
    public int minRemovals(int[] nums, int target) {
        int dp[][] = new int[nums.length][40001];
        for(int[] a : dp){
            Arrays.fill(a, -1);
        }
        int ans = solve(nums, 0 , target, dp);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
    public int solve(int nums[], int i , int cur, int [][]dp){
        if(i == nums.length){
            return cur == 0 ? 0 : Integer.MAX_VALUE;
        }
        if(dp[i][cur] != -1) return dp[i][cur];
        int not = solve(nums, i+1, cur , dp);
        if(not != Integer.MAX_VALUE) not += 1;
        int take = solve(nums, i+1, cur ^ nums[i], dp);
        return dp[i][cur] = Math.min(not, take);
    }
}