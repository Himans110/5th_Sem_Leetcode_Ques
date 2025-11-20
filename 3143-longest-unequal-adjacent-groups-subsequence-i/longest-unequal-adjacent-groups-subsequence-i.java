class Solution {
    public List<String> getLongestSubsequence(String[] w, int[] g) {
        List<String> ans = new ArrayList<>();
        ans.add(w[0]);
        for (int i = 1; i < g.length; i++) {
            if (g[i] != g[i - 1]) {
                ans.add(w[i]);
            }
        }
        return ans;
    }
}