class Solution {
    public int maxFreq(String s, int maxl, int min, int max) {
        HashMap<String , Integer> map = new HashMap<>();
        for (int i = 0; i <= s.length() - min; i++) {
            String m = s.substring(i, i + min);
            if (is_valid(m, maxl)) map.put(m, map.getOrDefault(m, 0)+1);
        }
        int maxf = 0;
        for(String i : map.keySet()){
            maxf= Math.max(maxf, map.get(i));
        }
        return maxf;
    }
    public boolean is_valid(String m , int maxf){
        HashSet<Character> set = new HashSet<>();
        for (char c : m.toCharArray()) {
            set.add(c);
            if (set.size() > maxf) return false;
        }
        return true;
    }
}