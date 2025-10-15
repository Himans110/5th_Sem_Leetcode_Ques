class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < items1.length; i++) {
            int val = items1[i][0];
            int wt = items1[i][1];
            map.putIfAbsent(val, new ArrayList<>());
            map.get(val).add(wt);
        }
        for (int i = 0; i < items2.length; i++) {
            int val = items2[i][0];
            int wt = items2[i][1];
            map.putIfAbsent(val, new ArrayList<>());
            map.get(val).add(wt);
        }
        List<Map.Entry<Integer, List<Integer>>> l = new ArrayList<>(map.entrySet());
        Collections.sort(l, (a, b) -> a.getKey() - b.getKey());
        List<List<Integer>> ans = new ArrayList<>();
        for (Map.Entry<Integer, List<Integer>> entry : l) {
            int key = entry.getKey();
            int sum = 0;
            for (int wt : entry.getValue()) {
                sum += wt;
            }
            ans.add(Arrays.asList(key, sum));
        }

        return ans;
    }
}