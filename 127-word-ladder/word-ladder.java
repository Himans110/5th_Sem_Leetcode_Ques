class Solution {
    class Pair{
        String s;
        int step;
        public Pair(String s, int step){
            this.s = s;
            this.step = step;
        }
    }
    public int ladderLength(String bw, String ew, List<String> arr) {
        HashSet<String> h = new HashSet<>(arr);
        if(!h.contains(ew)) return 0;
        int ans = Integer.MAX_VALUE;
        Queue<Pair> q = new LinkedList<>();
        HashSet<String> visited = new HashSet<>();
        q.add(new Pair(bw, 1));
        while(!q.isEmpty()){
            Pair r = q.poll();
            if(visited.contains(r.s)) continue;
            visited.add(r.s);
            if(r.s.equals(ew)){
                ans  = Math.min(ans, r.step);
                continue;
            }
            for(int i = 0; i < r.s.length(); i++){
                for(int j = 0; j < 26; j++){
                    char ch = (char) (j+'a');
                    if(ch == r.s.charAt(i)) continue;
                    String news = r.s.substring(0,i)+ch+r.s.substring(i+1, r.s.length());
                    if(h.contains(news) && !visited.contains(news)){
                        q.add(new Pair(news, r.step+1));
                    }
                }
            }
        }
        return ans == Integer.MAX_VALUE? 0 : ans;
    }
}