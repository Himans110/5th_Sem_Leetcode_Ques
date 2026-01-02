class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character, int[]> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.get(ch)[1] = i;
            } else {
                map.put(ch, new int[]{i, i});
            }
        }
        List<Integer> ans = new ArrayList<>();
        int maxLast = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            maxLast = Math.max(maxLast, map.get(ch)[1]);
            if (i == maxLast) {
                ans.add(i - start + 1);
                start = i + 1;
            }
        }
        return ans;
    }
}
