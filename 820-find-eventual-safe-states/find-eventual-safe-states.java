class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int[] out = new int[n];
        List<List<Integer>> rev = new ArrayList<>();
        for (int i = 0; i < n; i++) rev.add(new ArrayList<>());
        for (int i = 0; i < n; i++) {
            out[i] = graph[i].length;
            for (int v : graph[i]) {
                rev.get(v).add(i);
            }
        }
        Queue<Integer> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (out[i] == 0) q.add(i);
        }
        while (!q.isEmpty()) {
            int u = q.poll();
            ans.add(u);
            for (int p : rev.get(u)) {
                out[p]--;
                if (out[p] == 0) q.add(p);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
