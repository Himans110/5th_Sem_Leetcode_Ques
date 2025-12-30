class Solution {
    class DijkstraPair {
        int vtx;
        int cost;
        public DijkstraPair(int vtx, int cost) {
            this.vtx = vtx;
            this.cost = cost;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, new HashMap<>());
        }
        for (int[] t : times) {
            map.get(t[0]).put(t[1], t[2]);
        }
        // Step 2: Dijkstra
        HashSet<Integer> visited = new HashSet<>();
        PriorityQueue<DijkstraPair> pq =new PriorityQueue<>((a, b) -> a.cost - b.cost);
        pq.add(new DijkstraPair(k, 0));
        int ans = 0;
        while (!pq.isEmpty()) {
            // 1. remove
            DijkstraPair rp = pq.poll();
            // 2. ignore if visited
            if (visited.contains(rp.vtx)) continue;
            // 3. mark visited
            visited.add(rp.vtx);
            // 4. update answer
            ans = rp.cost;
            // 5. add neighbours
            for (int nbs : map.get(rp.vtx).keySet()) {
                if (!visited.contains(nbs)) {
                    int cost = map.get(rp.vtx).get(nbs);
                    pq.add(new DijkstraPair(nbs, rp.cost + cost));
                }
            }
        }
        // if all nodes not reached
        return visited.size() == n ? ans : -1;
    }
}
