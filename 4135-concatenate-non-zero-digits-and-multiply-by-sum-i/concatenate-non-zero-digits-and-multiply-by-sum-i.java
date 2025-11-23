class Solution {
    public long sumAndMultiply(int num) {
        StringBuilder ans = new StringBuilder();
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem != 0) {
                ans.append(rem);
                sum += rem;
            }
            num /= 10;
        }
        if (ans.length() == 0) return 0;
        long x = Long.parseLong(ans.reverse().toString());
        return x * sum;
    }
}
