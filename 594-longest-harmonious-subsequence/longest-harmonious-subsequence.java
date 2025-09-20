class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int c = 0;
        for (int key : freq.keySet()) {
            if (freq.containsKey(key + 1)) {
                c = Math.max(c, freq.get(key) + freq.get(key + 1));
            }
        }
        return c;
    }
}