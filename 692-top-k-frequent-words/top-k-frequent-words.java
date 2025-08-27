class Solution {
    public List<String> topKFrequent(String[] w, int k) {
       HashMap<String, Integer> map = new HashMap<>();
        for(String i : w){
            map.put(i,map.getOrDefault(i,0)+1);
        } 
         PriorityQueue<Map.Entry<String, Integer>> pq =
            new PriorityQueue<>((a, b) -> {
                if (a.getValue().equals(b.getValue())) {
                    return a.getKey().compareTo(b.getKey());
                }
                return b.getValue() - a.getValue();
            });
        pq.addAll(map.entrySet());
        List<String> l = new ArrayList<>();
        while(k-- > 0){
            l.add(pq.poll().getKey());
        }
        return l;
    }
}