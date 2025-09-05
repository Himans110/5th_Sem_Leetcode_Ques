class Solution {
    public int minimumLength(String s) {
        if(s.length() == 1) return 1;
        int i = 0 , j = s.length()-1;
        while (i < j && s.charAt(i) == s.charAt(j)) {
            char c = s.charAt(i);
            while (i <= j && s.charAt(i) == c) {
                i++;
            }
            while (j >= i && s.charAt(j) == c) {
                j--;
            }
        }
        return j - i + 1;
    }
}