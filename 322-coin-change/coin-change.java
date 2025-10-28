class Solution {
    public int coinChange(int[] coins, int amount) {
        int [][]dp = new int[coins.length][amount+1];
        for(int row[] : dp){
            Arrays.fill(row, -1);
        }
        int ans = fun(coins, amount , 0 , dp);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
    public int fun(int []arr, int amount , int idx, int [][]dp){
        if (amount == 0) return 0;
        if (idx == arr.length) return Integer.MAX_VALUE;
        if (dp[idx][amount] != -1) return dp[idx][amount];

        int take = Integer.MAX_VALUE;
        if (arr[idx] <= amount) {
            int sub = fun(arr, amount - arr[idx], idx, dp);
            if (sub != Integer.MAX_VALUE)  //  prevent overflow
                take = 1 + sub;
        }
        int skip = fun(arr, amount, idx + 1, dp);
        return dp[idx][amount] = Math.min(take, skip);
    }
}