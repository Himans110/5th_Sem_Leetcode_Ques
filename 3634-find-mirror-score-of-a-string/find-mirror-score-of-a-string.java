class Solution {
    public long calculateScore(String s) {
        HashMap<Character,Stack<Integer>> map = new HashMap<>();
        long ans = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            int x = ch-'a';
            char mch = (char)((25-x)+'a');
            if(map.containsKey(mch) && !map.get(mch).isEmpty()){
                int j= map.get(mch).pop();
                ans += i-j;
            }
            else{
                map.putIfAbsent(ch, new Stack<>());
                map.get(ch).push(i);
            }
        }
        return ans;
    }
}