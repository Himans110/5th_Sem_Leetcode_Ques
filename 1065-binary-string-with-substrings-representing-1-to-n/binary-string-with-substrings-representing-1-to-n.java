class Solution {
    public boolean queryString(String s, int n) {
        for(int i = 1 ;i <= n ; i++){
            String ans = Integer.toBinaryString(i);
            if(!s.contains(ans)){
                return false;
            }
        }
        return true;
    }
}