class Solution {
    public int countCharacters(String[] words, String c) {
        HashMap<Character,Integer> h = new HashMap<>();
        for (char i : c.toCharArray()) {
            h.put(i, h.getOrDefault(i, 0) + 1);
        }
        int ans = 0;
        for (String j : words) {
            HashMap<Character, Integer> h1 = new HashMap<>();
            for (char i : j.toCharArray()) {
                h1.put(i, h1.getOrDefault(i, 0) + 1);
            }
            boolean flag = true;
            for (char m : h1.keySet()) {
                if (!h.containsKey(m) || h1.get(m) > h.get(m)) {
                    flag = false;
                    break;
                }
            }
            if (flag) ans += j.length();
        }
        
        return ans;
    }
}