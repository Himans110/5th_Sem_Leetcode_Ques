class Solution {
    public int[] findOrder(int n, int[][] arr) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(i, new ArrayList<>());
        }
        for(int a[] : arr){
            map.get(a[1]).add(a[0]);
        }
        int in[] = new int[map.size()];
        for(int v1 : map.keySet()){
            for(int v2 : map.get(v1)){
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
            for (int nbrs: map.get(r)){
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