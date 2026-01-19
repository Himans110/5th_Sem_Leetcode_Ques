class Solution {
    class Pair {
        long dist;
        int node;
        public Pair(int node, long dist) {
            this.dist = dist;
            this.node = node;
        }
    }
    public int countPaths(int n, int[][] roads) {
        int mod = 1000000007;
        List<List<Pair>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        for(int g[] : roads){
            graph.get(g[0]).add(new Pair(g[1], g[2]));
            graph.get(g[1]).add(new Pair(g[0], g[2]));
        }
        long dis[] = new long[n];
        Arrays.fill(dis, Long.MAX_VALUE);
        int ways[] = new int[n];
        dis[0] = 0;
        ways[0] = 1;

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Long.compare(a.dist, b.dist));
        pq.offer(new Pair(0, 0));
        while(!pq.isEmpty()){
            Pair cur = pq.poll();
            int u = cur.node;
            long d = cur.dist;
            if(d > dis[u]) continue;
            for(Pair negh : graph.get(u)){
                int v = negh.node;
                long di = negh.dist;

                if(d+di < dis[v]){
                    dis[v] = d+di;
                    ways[v] = ways[u];
                    pq.add(new Pair(v, dis[v]));
                }
                else if(d+di == dis[v]){
                    ways[v] = (ways[v]+ways[u])%mod;
                }
            }
        }
        return ways[n - 1];
    }
}