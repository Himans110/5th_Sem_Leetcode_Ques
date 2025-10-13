class Solution{
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        ans.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            if (!is_ana(words[i], words[i - 1])) {
                ans.add(words[i]);
            }
        }
        return ans;
    }
    public boolean is_ana(String s1, String s2){
        if (s1.length() != s2.length()) return false;
        int[] freq = new int[26];
        for (char c : s1.toCharArray()) freq[c - 'a']++;
        for (char c : s2.toCharArray()) freq[c - 'a']--;
        for (int f : freq) if (f != 0) return false;

        return true;
    }
}