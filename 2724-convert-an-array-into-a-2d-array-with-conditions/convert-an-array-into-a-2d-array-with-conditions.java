class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        List<List<Integer>> ans = new ArrayList<>();
        while (!map.isEmpty()) {
            List<Integer> row = new ArrayList<>();
            List<Integer> waste = new ArrayList<>();
            for (int key : map.keySet()) {
                row.add(key);
                map.put(key, map.get(key) - 1);
                if (map.get(key) == 0) {
                    waste.add(key);
                }
            }
            for (int key : waste) {
                map.remove(key);
            }
            ans.add(row);
        }
        return ans;
    }
}