class Solution {
    public int bestClosingTime(String c) {
        int n = c.length();
        int[] N = new int[n + 1];
        int[] Y = new int[n + 1];
        int max = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (c.charAt(i - 1) == 'N')
                N[i] = N[i - 1] + 1;
            else
                N[i] = N[i - 1];
        }
        for (int i = n - 1; i >= 0; i--) {
            if (c.charAt(i) == 'Y')
                Y[i] = Y[i + 1] + 1;
            else
                Y[i] = Y[i + 1];
        }
        for (int i = 0; i <= n; i++) {
            if (N[i] + Y[i] < max) {
                max = N[i] + Y[i];
                ans = i;
            }
        }
        return ans;
    }
}