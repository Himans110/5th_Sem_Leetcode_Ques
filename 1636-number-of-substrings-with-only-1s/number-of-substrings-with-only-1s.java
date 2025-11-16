class Solution {
    public int numSub(String s) {
        long MOD = 1000000007;
        long fans = 0;
        long c1 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                c1++;
            } else {
                fans = (fans + (c1 * (c1 + 1) / 2) % MOD) % MOD;
                c1 = 0;
            }
        }
        fans = (fans + (c1 * (c1 + 1) / 2) % MOD) % MOD;
        return (int) fans;
    }
}