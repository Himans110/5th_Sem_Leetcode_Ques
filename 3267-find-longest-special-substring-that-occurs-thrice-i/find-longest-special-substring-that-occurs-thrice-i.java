class Solution {
    public int maximumLength(String s) {
        int ans = -1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String sub = s.substring(i, j + 1);
                if (!allSame(sub)) continue;
                if (is_true(s, sub)) {
                    ans = Math.max(ans, sub.length());
                }
            }
        }
        return ans;
    }
    public boolean is_true(String s, String sub) {
        int count = 0;
        for (int i = 0; i <= s.length() - sub.length(); i++) {
            if (s.substring(i, i + sub.length()).equals(sub)) {
                count++;
            }
        }
        return count >= 3;
    }
    public boolean allSame(String sub) {
        char c = sub.charAt(0);
        for (char ch : sub.toCharArray()) {
            if (ch != c) return false;
        }
        return true;
    }
}
