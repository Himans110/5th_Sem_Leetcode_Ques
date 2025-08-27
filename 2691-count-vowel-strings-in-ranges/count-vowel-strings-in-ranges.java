class Solution {
    public int[] vowelStrings(String[] w, int[][] q) {
        int[] arr = new int[w.length];
        for (int i = 0; i < w.length; i++) {
            String s = w[i];
            if (s.length() == 1) {
                arr[i] = vowel(s.charAt(0)) ? 1 : 0;
            } else {
                arr[i] = (vowel(s.charAt(0)) && vowel(s.charAt(s.length() - 1))) ? 1 : 0;
            }
        }
        int[] prefix = new int[w.length + 1];
        for (int i = 0; i < w.length; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }
        int[] ans = new int[q.length];
        for (int i = 0; i < q.length; i++) {
            int l = q[i][0];
            int r = q[i][1];
            ans[i] = prefix[r + 1] - prefix[l];
        }
        return ans;
    }
    public boolean vowel(char c){
        if(c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u') return true;
        return false;
    }
}