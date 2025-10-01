class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if(p.length() > s.length()) return ans;
        int[] freq1 = new int[26];
        int freq2[] = new int[26];
        for (int i = 0; i < p.length(); i++) {
            freq1[p.charAt(i) - 'a']++;
            freq2[s.charAt(i)-'a']++;
        }
        if(compare(freq1,freq2)) ans.add(0);
        int k = p.length();
        for(int i = k ; i < s.length() ; i++){
            freq2[s.charAt(i-k)-'a']--;
            freq2[s.charAt(i)-'a']++;
            if(compare(freq1,freq2)) ans.add(i-k+1);
        }
        return ans;
    }
    public boolean compare(int freq1[] , int freq2[]){
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) return false;
        }
        return true;
    }
}