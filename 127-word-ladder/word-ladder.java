class Solution {
    class Pair{
        String word;
        int step;
        public Pair(String word, int step){
            this.word = word;
            this.step = step;
        }
    }
    public int ladderLength(String bw, String ew, List<String> arr) {
        HashSet<String> dict = new HashSet<>(arr);
        if(!dict.contains(ew)) return 0;
        int ans = Integer.MAX_VALUE;
        Queue<Pair> q = new LinkedList<>();
        HashSet<String>visited = new HashSet<>();
        q.add(new Pair(bw,1));
        while(!q.isEmpty()){
            Pair rm = q.poll();
            if(visited.contains(rm.word)){
                continue;
            }
            visited.add(rm.word);
            if(rm.word.equals(ew)){
                ans = Math.min(ans,rm.step);
                continue;
            }
            // now check all comb
            for(int i=0;i<rm.word.length();i++){    
                for(int j=0;j<26;j++){
                    char ch = (char)('a'+j);
                    if(ch==rm.word.charAt(i)) continue;
                    String news = rm.word.substring(0,i)+ch+rm.word.substring(i+1,rm.word.length());
                    if(dict.contains(news) && !visited.contains(news)){
                        q.add(new Pair(news,rm.step+1));
                    }
                        
                }
            }
        }
        return ans==Integer.MAX_VALUE ? 0 : ans;
    }
}