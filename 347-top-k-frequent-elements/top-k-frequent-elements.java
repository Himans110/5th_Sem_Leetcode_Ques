class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> a = new HashMap<>();
        for(int i : nums){
            a.put(i,a.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer, Integer>> l = new ArrayList<>(a.entrySet());
        l.sort((e1, e2) -> e2.getValue() - e1.getValue());
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = l.get(i).getKey();
        }
        return arr;
    }
}