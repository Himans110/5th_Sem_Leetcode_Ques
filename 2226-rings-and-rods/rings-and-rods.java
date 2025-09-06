class Solution {
    public int countPoints(String r){
        HashMap<Integer , String> map = new HashMap<>();
        for (int i = 0; i < r.length(); i += 2) {
            char c = r.charAt(i); 
            int rod = r.charAt(i + 1) - '0';
            if (map.containsKey(rod)) {
                map.put(rod, map.get(rod) + c);
            } else {
                map.put(rod, String.valueOf(c));
            }
        }
        int count = 0;
        for (int i : map.keySet()) {
            String s = map.get(i);
            if (s.contains("B") && s.contains("R") && s.contains("G")) {
                count++;
            }
        }
        return count;
    }
}