class Solution {
    public int maxRepeating(String s, String w) {
        int k = 0;
        String build = w;
        while (s.contains(build)) {
            k++;
            build += w;
        }
        return k;
    }
}