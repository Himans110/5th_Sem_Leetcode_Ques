class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int st = 0;
        HashSet<Character> h = new HashSet<>();
        for(int end = 0 ; end < s.length() ; end++){
            while(h.contains(s.charAt(end))){
                h.remove(s.charAt(st));
                st++;
            }
            h.add(s.charAt(end));
            ans = Math.max(ans, end-st+1);
        }
        return ans;
    }
}