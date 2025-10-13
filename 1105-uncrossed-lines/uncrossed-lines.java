class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int dp[][] = new int[nums1.length][nums2.length];
        for(int i[] : dp){
            Arrays.fill(i, -1);
        }
        return lcs(nums1, nums2, 0 , 0, dp);
    }
    public int lcs(int s1[] , int s2[] , int i , int j, int [][]dp){
        if(i == s1.length || j == s2.length) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int ans = 0;
        if(s1[i] == s2[j]){
            ans  = 1+lcs(s1,s2,i+1,j+1,dp);
        }
        else{
            int f = lcs(s1, s2 ,i+1, j, dp);
            int s = lcs(s1,s2, i, j+1, dp);
            ans = Math.max(f,s);
        }
        return dp[i][j] = ans;
    }
}