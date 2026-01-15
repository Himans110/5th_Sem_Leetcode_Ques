class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] h_bars, int[] v_bars) {
        int maxh = fun(h_bars), maxv = fun(v_bars);
        int side = Math.min(maxh + 1, maxv + 1);
        return side * side;
    }
    public int fun(int[] bars) {
        if (bars.length == 0) return 0;

        Arrays.sort(bars);

        int max_len = 1, curr_len = 1;
        for (int i = 1; i < bars.length; i++) {
            if (bars[i] == bars[i - 1] + 1) {
                curr_len++;
                max_len = Math.max(max_len, curr_len);
            } else {
                curr_len = 1; 
            }
        }

        return max_len;
    }
}