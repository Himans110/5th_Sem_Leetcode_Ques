class Solution {
    public boolean validPath(int n, int[][] edges, int s, int d) {
        List<List<Integer>> l = new ArrayList<>();
        for(int i = 0; i < n; i++){
            l.add(new ArrayList<>());
        }
        for(int a[] : edges){
            int u = a[0],v = a[1];
            l.get(u).add(v);
            l.get(v).add(u);
        }
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        q.add(s);
        while(!q.isEmpty()){
            int r = q.poll();
            if(visited.contains(r)) continue;
            visited.add(r);
            if(r == d) return true;
            for(int nbr : l.get(r)){
                if(!visited.contains(nbr)){
                    q.add(nbr);
                }
            }
        }
        return false;
    }
}