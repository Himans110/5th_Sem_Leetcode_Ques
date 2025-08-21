class Solution {
    public String largestWordCount(String[] m, String[] s) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length; i++) {
            String p = m[i];
            String[] arr = p.split(" ");
            if (map.containsKey(s[i])) {
                map.put(s[i], map.get(s[i]) + arr.length);
            } else {
                map.put(s[i], arr.length);
            }
        }
        int max = 0;
        for (Integer val : map.values()) {
            max = Math.max(max, val);
        }
        List<String> l = new ArrayList<>();
        for (String key : map.keySet()) {
            if (map.get(key) == max) {
                l.add(key);
            }
        }
        Collections.sort(l);
        return l.get(l.size() - 1);
    }
}