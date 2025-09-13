import java.util.HashMap;

class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> vo = new HashMap<>();
        HashMap<Character, Integer> co = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') { // FIXED 'o'
                vo.put(c, vo.getOrDefault(c, 0) + 1);
            } else {
                co.put(c, co.getOrDefault(c, 0) + 1);
            }
        }
        int cv = 0 , cc = 0;
        for (int val : vo.values()) {
            cv = Math.max(cv, val);
        }
        for (int val : co.values()) {
            cc = Math.max(cc, val);
        }
        return cc + cv;
    }
}
