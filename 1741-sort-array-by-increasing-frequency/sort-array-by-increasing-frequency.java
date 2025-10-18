class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> l = new ArrayList<>(map.entrySet());
        Collections.sort(l, (a, b) -> {
            if (a.getValue().equals(b.getValue()))
                return b.getKey() - a.getKey();
            return a.getValue() - b.getValue();
        });
        int[] ans = new int[nums.length];
        int m = 0; 
        for (Map.Entry<Integer, Integer> e : l) {
            int key = e.getKey();
            int value = e.getValue();
            for (int i = 0; i < value; i++) {
                ans[m++] = key;
            }
        }
        return ans;
    }
}