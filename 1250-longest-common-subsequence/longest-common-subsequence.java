class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int dp[][] = new int[s1.length()][s2.length()];
        for(int d[] : dp){
            Arrays.fill(d , -1);
        }
        return solve(s1, s2 , 0 , 0, dp);
    }
    public int solve(String s1, String s2, int i , int j, int [][]dp){
        if(i >= s1.length() || j >= s2.length()) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int ans = 0;
        if(s1.charAt(i) == s2.charAt(j)){
            ans = 1+solve(s1, s2 , i+1, j+1, dp);
        }
        else{
            int a = solve(s1, s2 , i+1, j, dp);
            int b = solve(s1 , s2 , i, j+1, dp);
            ans += Math.max(a,b);
        }
        return dp[i][j] = ans;
    }
}