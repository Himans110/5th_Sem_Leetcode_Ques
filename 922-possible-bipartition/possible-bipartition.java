class Solution {
    class BipartitePair {
        int vtx;
        int color;
        BipartitePair(int vtx, int color) {
            this.vtx = vtx;
            this.color = color;
        }
    }
    public boolean possibleBipartition(int n, int[][] dislikes) {
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        for(int i = 1; i <= n; i++){
            graph.put(i, new ArrayList<>());
        }
        for(int[] d : dislikes){
            graph.get(d[0]).add(d[1]);
            graph.get(d[1]).add(d[0]);
        }
        HashMap<Integer, Integer> visited = new HashMap<>();
        Queue<BipartitePair> q = new LinkedList<>();
        for(int i = 1; i <= n; i++){
            if(visited.containsKey(i)) continue;
            q.add(new BipartitePair(i, 0));
            while(!q.isEmpty()){
                BipartitePair rp = q.poll();
                if(visited.containsKey(rp.vtx)){
                    if(visited.get(rp.vtx) != rp.color)
                        return false;
                    continue;
                }
                visited.put(rp.vtx, rp.color);
                for(int nbr : graph.get(rp.vtx)){
                    if(!visited.containsKey(nbr)){
                        q.add(new BipartitePair(nbr, 1 + rp.color));
                    }
                }
            }
        }
        return true;
    }
}
