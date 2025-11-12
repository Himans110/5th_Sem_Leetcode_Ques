class Solution {
    public int numberOfSubstrings(String s) {
        int i = 0;
        Map<Character,Integer> map = new HashMap<>();
        int ans = 0;
        for(int j = 0 ; j < s.length() ; j++){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            while (map.getOrDefault('a', 0) >= 1 &&
                   map.getOrDefault('b', 0) >= 1 &&
                   map.getOrDefault('c', 0) >= 1) {
                ans += s.length() - j;
                char ci = s.charAt(i);
                map.put(ci, map.get(ci) - 1);
                i++;
            }
        }
        return ans;
    }
}