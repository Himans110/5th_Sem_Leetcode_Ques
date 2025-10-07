class Solution {
    public int findPermutationDifference(String s, String t) {
        int ans = 0;
        for(int i = 0 ; i < s.length() ; i++){
            int ch = s.charAt(i);
            for(int j = 0 ; j < t.length() ; j++){
                if(ch == t.charAt(j)){
                    ans += Math.abs(i-j);
                }
            }
        }
        return ans;   
    }
}