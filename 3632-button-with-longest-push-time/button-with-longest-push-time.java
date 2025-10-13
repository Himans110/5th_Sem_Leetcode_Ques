class Solution {
    public int buttonWithLongestTime(int[][] e) {
        if(e.length == 1) return e[0][0];
        int max = e[0][1];
        int ans = e[0][0];
        for (int i = 1; i < e.length; i++) {
            int duration = e[i][1] - e[i - 1][1];
            if (duration > max || (duration == max && e[i][0] < ans)) {
                max = duration;
                ans = e[i][0];
            }
        }
        return ans;
    }
}