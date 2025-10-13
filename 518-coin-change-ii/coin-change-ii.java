class Solution {
    public int change(int amount, int[] coins) {
        int [][] dp = new int[coins.length][amount + 1];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        return coin(coins,amount, 0, dp);
    }
    public static int coin(int []coin, int amount, int idx, int dp[][]){
        if(amount == 0) return 1;
        if(idx == coin.length) return 0;
        if(dp[idx][amount] != -1) return dp[idx][amount];
        int inx = 0, exc = 0;
        if(coin[idx] <= amount){
            inx = coin(coin, amount-coin[idx], idx , dp);
        }
        exc = coin(coin, amount, idx+1 , dp);
        return dp[idx][amount] = inx+exc;
    }
}