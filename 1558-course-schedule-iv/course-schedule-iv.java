class Solution {
    List<List<Integer>> graph;
    public List<Boolean> checkIfPrerequisite(int n, int[][] arr, int[][] q) {
        graph = new ArrayList<>();
        for(int i = 0; i < n ; i++){
            graph.add(new ArrayList<>());
        }
        for(int a[] : arr){
            int u = a[0], v = a[1];
            graph.get(u).add(v);
        }
        List<Boolean> ans = new ArrayList<>();
        for(int a[] : q){
            int s = a[0], d = a[1];
            ans.add(validPath(s,d));
        }
        return ans;
    }
    public boolean validPath(int s, int d) {
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        q.add(s);
        while(!q.isEmpty()){
            int r = q.poll();
            if(visited.contains(r)) continue;
            visited.add(r);
            if(r == d) return true;
            for(int nbr : graph.get(r)){
                if(!visited.contains(nbr)){
                    q.add(nbr);
                }
            }
        }
        return false;
    }
}