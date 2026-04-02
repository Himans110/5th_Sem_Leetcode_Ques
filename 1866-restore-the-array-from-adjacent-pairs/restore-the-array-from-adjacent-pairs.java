class Solution {
    public int[] restoreArray(int[][] arr) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        int n = arr.length + 1;
        for (int[] a : arr) {
            int u = a[0], v = a[1];
            graph.putIfAbsent(u, new ArrayList<>());
            graph.putIfAbsent(v, new ArrayList<>());
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        int key = 0;
        for (int node : graph.keySet()) {
            if (graph.get(node).size() == 1) {
                key = node;
                break;
            }
        }
        int[] ans = new int[n];
        int j = 0;
        Stack<Integer> st = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();
        st.push(key);
        while (!st.isEmpty()) {
            int r = st.pop();
            if (visited.contains(r)) continue;
            visited.add(r);
            ans[j++] = r;
            for (int nei : graph.get(r)) {
                if (!visited.contains(nei)) {
                    st.push(nei);
                }
            }
        }
        return ans;
    }
}