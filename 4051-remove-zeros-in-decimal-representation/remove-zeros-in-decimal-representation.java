class Solution {
    public long removeZeros(long n) {
        StringBuilder ans = new StringBuilder();
        while (n > 0) {
            long rem = n % 10;
            if (rem != 0) ans.append(rem);
            n /= 10;
        }
        if (ans.length() == 0) return 0;
        return Long.parseLong(ans.reverse().toString());
    }
}
