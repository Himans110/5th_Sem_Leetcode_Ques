class Solution {
    public int maxVowels(String s, int k) {
        StringBuilder g = new StringBuilder();
        int count = 0;
        int max = 0;
        for(int i = 0 ; i< k ; i++){
            g.append(s.charAt(i));
            if(isvowel(s.charAt(i))) count++;
        }
        max = count;
        for (int i = k; i < s.length(); i++) {
            if (isvowel(g.charAt(0))) count--;
            g.deleteCharAt(0);
            g.append(s.charAt(i));
            if (isvowel(s.charAt(i))) count++;
            max = Math.max(max, count);
        }
        return max;
    }
    public boolean isvowel(char c){
        if(c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u') return true;
        return false;
    }
}