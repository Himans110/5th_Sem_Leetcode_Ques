class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> l = new ArrayList<>();
        for(int i = 0 ; i < s.length()-p.length()+1 ; i++){
            String ans = s.substring(i,i+p.length());
            if(anagran(ans,p)) l.add(i);
        }
        return l;
    }
    public boolean anagran(String s1 , String s2){
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            freq2[s2.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) return false;
        }
        return true;
    }
}