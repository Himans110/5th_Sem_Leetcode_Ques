class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        for(int i = 0 ; i < s.length()-2 ; i++){
            String j = s.substring(i,i+3);
            if(unique(j)) count++;
        }
        return count;
    }
    public boolean unique(String s){
        HashSet<Character> h = new HashSet<>();
        for(int i = 0 ; i < 3 ; i++){
            if(h.contains(s.charAt(i))) return false;
            h.add(s.charAt(i));
        }
        return true;
    }
}