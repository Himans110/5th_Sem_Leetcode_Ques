class Solution {
    public int totalFruit(int[] f) {
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0, max = 0;
        for (int right = 0; right < f.length; right++) {
            map.put(f[right], map.getOrDefault(f[right], 0) + 1);
            while (map.size() > 2) {
                int k = f[left];
                map.put(k, map.get(k) - 1);
                if (map.get(k) == 0) map.remove(k);
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}