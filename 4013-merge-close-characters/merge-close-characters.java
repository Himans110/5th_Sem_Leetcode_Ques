class Solution {
    public String mergeCharacters(String s, int k) {
        StringBuilder str = new StringBuilder(s);
        int i = 0;
        while (i < str.length()) {
            char ch = str.charAt(i);
            boolean flag = false;
            int limit = Math.min(i + k + 1, str.length());
            for (int j = i + 1; j < limit; j++) {
                if (ch == str.charAt(j)) {
                    str.deleteCharAt(j);
                    flag = true;
                    i = 0;
                    break;
                }
            }
            if (!flag) {
                i++;
            }
        }
        return str.toString();
    }
}