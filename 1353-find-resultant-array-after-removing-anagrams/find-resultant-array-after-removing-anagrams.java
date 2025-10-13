class Solution{
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        ans.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            if (!is_ana(words[i], words[i - 1])) {
                ans.add(words[i]);
            }
        }
        return ans;
    }
    public boolean is_ana(String s1, String s2){
        TreeMap<Character,Integer> map1 = new TreeMap<>();
        TreeMap<Character,Integer> map2 = new TreeMap<>();
        for(char i : s1.toCharArray()){
            map1.put(i,map1.getOrDefault(i,0)+1);
        }
        for(char i : s2.toCharArray()){
            map2.put(i,map2.getOrDefault(i,0)+1);
        }
        return map1.equals(map2);
    }
}