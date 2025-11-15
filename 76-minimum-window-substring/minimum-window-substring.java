class Solution {
    public String minWindow(String s, String t) {
       if (t.length() > s.length()) return "";
        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int required = t.length();
        int start = 0, end = 0;
        int minLen = Integer.MAX_VALUE, minStart = 0;
        while (end < s.length()) {
            char ch = s.charAt(end);
            map.put(ch, map.getOrDefault(ch, 0) - 1);
            if (map.get(ch) >= 0) {
                required--;
            }
            while (required == 0) {
                int curr = end - start + 1;
                if (curr < minLen) {
                    minLen = curr;
                    minStart = start;
                }
                char lc = s.charAt(start);
                map.put(lc, map.get(lc) + 1);
                if (map.get(lc) > 0) {
                    required++;
                }
                start++;
            }
            end++;
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}