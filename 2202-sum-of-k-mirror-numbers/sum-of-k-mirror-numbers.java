class Solution {
    public long kMirror(int k, int n) {
        int L = 1;
        long sum = 0L;
        while (n > 0) {
            int half = (L + 1) / 2;
            int min = (int) Math.pow(10, half - 1);
            int max = (int) Math.pow(10, half) - 1;
            for (int num = min; num <= max; num++) {
                String rn = new StringBuilder(String.valueOf(num)).reverse().toString();
                String pal = String.valueOf(num) + (L % 2 == 0 ? rn : rn.substring(1));
                long val = Long.parseLong(pal);
                if (ispal(baseK(val, k))) {
                    sum += val;
                    n--;
                    if (n == 0) return sum;
                }
            }
            L++;
        }
        return sum;
    }
    public String baseK(long n, int k) {
        StringBuilder ans = new StringBuilder();
        while (n > 0) {
            ans.append(n % k);
            n /= k;
        }
        return ans.toString();
    }
    public boolean ispal(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
