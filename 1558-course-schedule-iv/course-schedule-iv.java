class Solution {
    public List<Boolean> checkIfPrerequisite(int n, int[][] arr, int[][] qu) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < n ; i++){
            graph.add(new ArrayList<>());
        }
        for(int a[] : arr){
            int u = a[0], v = a[1];
            graph.get(u).add(v);
        }
        for(int i = 0; i < n ; i++){
            Queue<Integer> q = new LinkedList<>();
            HashSet<Integer> visited = new HashSet<>();
            q.add(i);
            while(!q.isEmpty()){
                int r = q.poll();
                if(visited.contains(r)) continue;
                visited.add(r);
                graph.get(i).add(r);
                for(int nbr : graph.get(r)){
                    if(!visited.contains(nbr)){
                        q.add(nbr);
                    }
                }
            }
        }
        List<Boolean> ans = new ArrayList<>();
        for(int[] a : qu){
            ans.add(graph.get(a[0]).contains(a[1]));
        }
        return ans;
    }
}