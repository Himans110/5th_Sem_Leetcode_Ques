class Solution {
    public int minDeletion(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char i : s.toCharArray()){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        if(map.size() == k) return 0;
        List<Map.Entry<Character, Integer>> list =new ArrayList<>(map.entrySet());
        Collections.sort(list, (a, b) -> a.getValue() - b.getValue());
        int ans = 0;
        int rem = map.size()-k;
        for (int i = 0; i < rem; i++) {
            ans += list.get(i).getValue();
        }
        return ans;
    }
}