class Solution {
    public int numOfWays(int n) {
        int mod=1000000007;
        // A → ABC pattern count for row 1(3 X 2 X 1)
        // B → ABA pattern count for row 1(3 X 2)
        long A=6,B=6;
        for(int i=2;i<=n;i++){
            long newa=(2*A+2*B)%mod; // ABC pattern
            long newb=(2*A +3*B)%mod; // ABA pattern
            A=newa;
            B=newb;
        }
        return (int) (A+B)%mod;
    }
}