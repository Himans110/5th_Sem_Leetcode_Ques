class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer,Integer>> l = new ArrayList<>(map.entrySet());
        l.sort((e1,e2)-> e2.getValue()-e1.getValue());
        int j = 0;
        int ans[] = new int[k];
        for(Map.Entry<Integer,Integer> e : l){
            if(k == 0) break;
            ans[j++] = e.getKey();
            k--;
        }
        return ans;
    }
}