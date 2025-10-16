class Solution {
    public boolean isBipartite(int[][] graph) {
        return isBipartile(graph);
    }
    public boolean isBipartile(int [][]graph){
        Queue<BipartilePair> q = new LinkedList<>();
        HashMap<Integer, Integer> visited = new HashMap<>();
        for(int i = 0 ; i < graph.length ; i++){
            if(visited.containsKey(i)) continue;
            q.add(new BipartilePair(i , 0));
            while(!q.isEmpty()){
                // 1. remove
                BipartilePair rp = q.poll();
                // 2. ignore if already visited
                if(visited.containsKey(rp.vtx)){
                    if(visited.get(rp.vtx) != rp.dis){
                        return false;
                    }
                    continue;
                }
                // 3. mark visited
                visited.put(rp.vtx, rp.dis);
                // 4. self work
                // 5. Add nbrs
                for(int nbrs : graph[rp.vtx]){
                    if(!visited.containsKey(nbrs)){
                        q.add(new BipartilePair(nbrs, rp.dis+1));
                    }
                }
            }
        }
        return true;
    }
    class BipartilePair {
        int vtx;
        int dis;
        public BipartilePair(int vtx, int dis) {
            this.vtx = vtx;
            this.dis = dis;
        }
    }
}