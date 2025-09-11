class Solution {
    public String sortVowels(String s) {
        List<Character> l = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                l.add(c);
            }
        }
        Collections.sort(l);
        String t = "";
        int m = 0;
        for(char i : s.toCharArray()){
            if(!isVowel(i)){
                t+=i;
            }
            else{
                t += l.get(m++);
            }
        }
        return t;
    }
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}