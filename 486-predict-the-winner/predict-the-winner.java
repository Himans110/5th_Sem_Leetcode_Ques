class Solution {
    public boolean predictTheWinner(int[] arr) {
        int n = arr.length;
        int dp[][] = new int[n][n];
        for(int[] row : dp) Arrays.fill(row, -1);
        int total = 0;
        for (int num : arr) total += num;
        int player1 = Optimal_game(arr, 0, n - 1, dp);
        return player1 >= (total - player1);
    }
    public static int Optimal_game(int arr[], int i, int j, int dp[][]) {
        if (i > j) return 0;
        if (dp[i][j] != -1) return dp[i][j];
        int f = arr[i] + Math.min(
                Optimal_game(arr, i + 2, j, dp),
                Optimal_game(arr, i + 1, j - 1, dp)
        );
        int s = arr[j] + Math.min(
                Optimal_game(arr, i + 1, j - 1, dp),
                Optimal_game(arr, i, j - 2, dp)
        );
        return dp[i][j] = Math.max(f, s);
    }
}