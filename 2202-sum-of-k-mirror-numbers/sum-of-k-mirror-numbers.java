class Solution {
    public long kMirror(int k, int n) {
        int L = 1;
        long sum = 0L;
        while (n > 0) {
            int half = (L + 1) / 2;
            int min = (int) Math.pow(10, half - 1);
            int max = (int) Math.pow(10, half) - 1;
            if (L % 2 == 0) {
                for (int num = min; num <= max; num++) {
                    String s = String.valueOf(num) + rev(num);
                    long val = Long.parseLong(s);
                    if (ispal(baseK(val, k))) {
                        sum += val;
                        n--;
                        if (n == 0) return sum;
                    }
                }
            } 
            else {
                for (int num = min; num <= max; num++) {
                    String s = String.valueOf(num) + rev(num).substring(1);
                    long val = Long.parseLong(s);
                    if (ispal(baseK(val, k))) {
                        sum += val;
                        n--;
                        if (n == 0) return sum;
                    }
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
    public String rev(int num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(num % 10);
            num /= 10;
        }
        return sb.toString();
    }
}
