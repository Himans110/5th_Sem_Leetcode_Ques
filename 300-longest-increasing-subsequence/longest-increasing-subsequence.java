class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[][] = new int[nums.length][nums.length+1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(nums, nums.length , 0 , -1,dp);
    }
    static int solve(int arr[], int n , int curr , int prev,int [][]dp){
        // base
        if(curr == n){
            return 0;
        }
        if (dp[curr][prev + 1] != -1) return dp[curr][prev + 1];
        //include
        int take = 0;
        if(prev == -1 || arr[curr] > arr[prev]){
            take = 1 + solve(arr,n , curr+1,curr,dp);
        }
        // exclude
        int nottake = 0+solve(arr,n , curr+1,prev,dp);
        return dp[curr][prev+1] =  Math.max(take,nottake);
    }
}