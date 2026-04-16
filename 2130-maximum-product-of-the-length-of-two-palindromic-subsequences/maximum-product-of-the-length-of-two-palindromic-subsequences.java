class Solution {
    public int maxProduct(String s) {
        List<Integer> l = new ArrayList<>();
        solve(s, "", 0, 0, l);
        int max = 0;
        for (int i = 0; i < l.size(); i++) {
            int a = Integer.bitCount(l.get(i));
            for (int j = i + 1; j < l.size(); j++) {
                if ((l.get(i) & l.get(j)) == 0) {
                    int b = Integer.bitCount(l.get(j));
                    max = Math.max(max, a * b);
                }
            }
        }
        return max;
    }
    public void solve(String s, String ans, int i, int mask, List<Integer> l) {
        if (i == s.length()) {
            if (pal(ans)) {
                l.add(mask);
            }
            return;
        }
        solve(s, ans + s.charAt(i), i + 1, (mask | (1 << i)), l);
        solve(s, ans, i + 1, mask, l);
    }

    public boolean pal(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }
}