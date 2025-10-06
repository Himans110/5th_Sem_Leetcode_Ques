class Solution {
    public int minDistance(String word1, String word2) {
        int [][]dp = new int[word1.length()][word2.length()];
        return fun(word1, word2 , 0 ,0,dp);   
    }
    public int fun(String w1 , String w2, int i , int j, int [][]dp){
        if(i == w1.length()){
            return w2.length()-j;
        }
        if(j == w2.length()){
            return w1.length()-i;
        }
        if(dp[i][j] != 0){
            return dp[i][j];
        }
        if(w1.charAt(i)==w2.charAt(j)){
            return fun(w1,w2, i+1 , j+1,dp);
        }
        else{
            int ist = fun(w1,w2,i,j+1,dp);
            int del = fun(w1,w2,i+1,j,dp);
            int rep = fun(w1, w2, i+1, j+1,dp);
            return dp[i][j] =  Math.min(ist,Math.min(del,rep))+1;
        }
    }
}