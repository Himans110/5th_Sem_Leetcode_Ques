class Solution {
   class State {
        int node;
        int cost;
        int stops;
        State(int node, int cost, int stops) {
            this.node = node;
            this.cost = cost;
            this.stops = stops;
        }
    }
    public int findCheapestPrice(int n, int[][] arr, int src, int dst, int k) {
        Map<Integer, List<int[]>> graph = new HashMap<>();

        for (int i = 0; i < n; i++) graph.put(i, new ArrayList<>());
        for (int[] f : arr) {
            graph.get(f[0]).add(new int[]{f[1], f[2]});
        }

        PriorityQueue<State> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);
        pq.add(new State(src, 0, 0));

        // best[node][stops] = minimum cost
        int[][] best = new int[n][k + 2];
        for (int[] row : best) Arrays.fill(row, Integer.MAX_VALUE);

        best[src][0] = 0;
        while (!pq.isEmpty()) {
            State cur = pq.poll();

            if (cur.node == dst) return cur.cost;
            if (cur.stops > k) continue;

            for (int[] edge : graph.get(cur.node)) {
                int next = edge[0];
                int price = edge[1];

                int newcost = cur.cost + price;
                int stop = cur.stops + 1;

                if (newcost < best[next][stop]) {
                    best[next][stop] = newcost;
                    pq.add(new State(next, newcost, stop));
                }
            }
        }
        return -1;
    }
} 