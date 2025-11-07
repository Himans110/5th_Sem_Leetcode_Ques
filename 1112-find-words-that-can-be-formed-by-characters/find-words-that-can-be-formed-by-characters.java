class Solution {
    public int countCharacters(String[] words, String chars) {
       int[] charFreq = new int[26];
        for (char c : chars.toCharArray()) {
            charFreq[c - 'a']++;
        }
        int totalLength = 0;

        for (String word : words) {
            int[] temp = charFreq.clone();
            boolean canForm = true;

            for (char c : word.toCharArray()) {
                if (--temp[c - 'a'] < 0) {
                    canForm = false;
                    break;
                }
            }

            if (canForm) {
                totalLength += word.length();
            }
        }

        return totalLength;
    }
}