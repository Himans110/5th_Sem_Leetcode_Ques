class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int ans = 0;
        int max = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);
            max = Math.max(max, map.get(c));
            while ((right-left+1) - max > k) { // curr win size = r-l+1
                char l = s.charAt(left);
                int count = map.get(l);
                if (count == 1) {
                    map.remove(l);
                } else {
                    map.put(l, count - 1);
                }
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
