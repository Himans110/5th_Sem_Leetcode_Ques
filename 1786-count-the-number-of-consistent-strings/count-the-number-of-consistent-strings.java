class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> h = new HashSet<>();
        for(char i : allowed.toCharArray()){
            h.add(i);
        }
        int count = 0;
        for(String i : words){
            boolean flag = true;
            for(char j : i.toCharArray()){
                if(!h.contains(j)){
                    flag = false;
                    break;
                }
            }
            if(flag) count++;
        }
        return count;
    }
}