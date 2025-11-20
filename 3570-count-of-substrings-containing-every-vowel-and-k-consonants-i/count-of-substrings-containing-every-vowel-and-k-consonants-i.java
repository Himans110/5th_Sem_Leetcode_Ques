class Solution {
    public int countOfSubstrings(String s, int k) {
        int count = 0;
        for (int m = 0 ; m < s.length() ; m++) {
            int a = 0, e = 0, i = 0, o = 0, u = 0, c = 0;
            for (int j = m ; j < s.length() ; j++) {
                if (s.charAt(j) == 'a') a++;
                else if (s.charAt(j) == 'e') e++;
                else if (s.charAt(j) == 'i') i++;
                else if (s.charAt(j) == 'o') o++;
                else if (s.charAt(j) == 'u') u++;
                else c++;
                if (a > 0 && e > 0 && i > 0 && o > 0 && u > 0 && c == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
