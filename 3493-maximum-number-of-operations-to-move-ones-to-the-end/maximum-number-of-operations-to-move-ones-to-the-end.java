class Solution {
    public int maxOperations(String s) {
        int step = 0;
        int c1 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                c1++;
            } else if (i > 0 && s.charAt(i-1) == '1') {
                step += c1;
            }
        }
        return step;
    }
}