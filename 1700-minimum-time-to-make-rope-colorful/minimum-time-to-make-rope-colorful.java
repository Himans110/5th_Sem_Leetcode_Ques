class Solution {
    public int minCost(String c, int[] n) {
        int ans = 0;
        int cost = n[0];
        for (int i = 1; i < c.length(); i++) {
            if (c.charAt(i) == c.charAt(i - 1)) {
                ans += Math.min(cost, n[i]);
                cost = Math.max(cost, n[i]);
            } else {
                cost = n[i];
            }
        }
        return ans;
    }
}