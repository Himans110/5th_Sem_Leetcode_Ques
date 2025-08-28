class Solution {
    int count = 0;
    public int numTilePossibilities(String tiles) {
        permutation(tiles,"");
        return count;
    }

    public void permutation(String s, String ans) {
        if (s.length() == 0) {
            count++;
            return;
        }
        if(ans.length() > 0){
            count++;
        }
        for (int i = 0 ; i < s.length() ; i++) {
            char ch = s.charAt(i);
            if (!ispresent(s, i + 1, ch)) { 
                String s1 = s.substring(0, i);
                String s2 = s.substring(i + 1);
                permutation(s1 + s2, ans + ch);
            }
        }
    }
    public boolean ispresent(String ques, int idx, char c) {
        for (int i = idx; i < ques.length() ; i++) {
            if (ques.charAt(i) == c) return true;
        }
        return false;
    }
}