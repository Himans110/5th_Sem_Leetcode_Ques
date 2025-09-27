class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> a = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            a.put(s.charAt(i),a.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
            (x, y) -> y.getValue() - x.getValue()
        );
        pq.addAll(a.entrySet());
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry<Character,Integer> x = pq.poll();
            char ch = x.getKey();
            int val = x.getValue();
            for(int i = 0 ; i < val ; i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}