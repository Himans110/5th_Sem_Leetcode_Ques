class Solution {
    public int coinChange(int[] coins, int amount) {
        int [][]dp = new int[coins.length][amount+1];
        for(int row[] : dp){
            Arrays.fill(row, -1);
        }
        int ans = fun(coins, amount , 0 , dp);
        return ans == (int)1e9 ? -1 : ans;
    }
    public int fun(int []arr, int amount , int idx, int [][]dp){
        if(amount == 0) return 0;
        if(idx == arr.length) return (int)1e9;
        if(dp[idx][amount]!= -1) return dp[idx][amount];
        int take = (int)1e9;
        if(arr[idx] <= amount){
            take = 1+fun(arr, amount-arr[idx], idx, dp);
        }
        int skip = fun(arr, amount, idx+1, dp);
        return dp[idx][amount] = Math.min(take,skip);
    }
}