class Solution {
    public int maxJump(int[] s) {
        int ans = s[1] - s[0];
        for(int i = 2 ; i < s.length ; i++){
            ans = Math.max(ans, s[i]- s[i-2]);
        }
        // for(int i = 3 ; i < s.length ; i++){
        //     ans = Math.max(ans, s[i]- s[i-2]);
        // }
        return ans;
    }
}