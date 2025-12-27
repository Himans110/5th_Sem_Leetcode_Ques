class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> h = new HashSet<>();
        for(char c : s.toCharArray()){
            h.add(c);
        }
        return h.size();
    }
}