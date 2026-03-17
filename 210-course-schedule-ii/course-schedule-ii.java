class Solution {
    public int[] findOrder(int n, int[][] arr) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < n ; i++){
            graph.add(new ArrayList<>());
        }
        for(int a[] : arr){
            int u = a[0], v = a[1];
            graph.get(v).add(u);
        }
        int in[] = new int[n];
        for(List<Integer> l : graph){
            for(int v2 : l){
                in[v2]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < in.length; i++) {
            if (in[i] == 0) {
                q.add(i);
            }
        }
        int []ans = new int[n];
        int i = 0;
        while (!q.isEmpty()){
            int r = q.poll();
            ans[i++] = r;
            for (int nbrs: graph.get(r)){
                in[nbrs]--;
                if (in[nbrs]==0){
                    q.add(nbrs);
                }
            }
        }
        if (i != n) return new int[0];
        return ans;
    }
}