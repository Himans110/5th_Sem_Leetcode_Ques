class Solution {
    public String largestMerge(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        int i = 0, j = 0;
        while (i < word1.length() && j < word2.length()) {
            if (word1.substring(i).compareTo(word2.substring(j)) > 0) {
                ans.append(word1.charAt(i++));
            } else {
                ans.append(word2.charAt(j++));
            }
        }
        while (i < word1.length()) ans.append(word1.charAt(i++));
        while (j < word2.length()) ans.append(word2.charAt(j++));
        return ans.toString();
    }
}
