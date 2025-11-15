class Solution {
    public int minInsertions(String s) {
        String s1 = "";
        for(int i = s.length()-1 ; i>= 0 ; i--){
            s1+=s.charAt(i);
        }
        return s.length() - lcs(s,s1);
    }
    public int lcs(String text1, String text2) {
        int dp[][] = new int[text1.length()][text2.length()];
        for(int i[] : dp){
            Arrays.fill(i, -1);
        }
        return fun(text1, text2, 0 , 0, dp);
    }
    public int fun(String s1 , String s2 , int i , int j, int [][]dp){
      if(i >= s1.length() || j >= s2.length()) return 0;
      if(dp[i][j] != -1) return dp[i][j];
      int ans = 0;
      if(s1.charAt(i) == s2.charAt(j)){
        ans = 1+(fun(s1, s2 ,i+1, j+1 , dp));
      }
      else{
        int f = fun(s1, s2 , i+1 , j , dp);
        int s = fun(s1, s2 , i , j+1, dp);
        ans = Math.max(f,s);
      }
     return  dp[i][j] = ans;
    }
}