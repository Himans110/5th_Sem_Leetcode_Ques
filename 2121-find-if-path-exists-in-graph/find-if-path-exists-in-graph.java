class Solution {
    public boolean validPath(int n, int[][] edges, int src, int des) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(i,new ArrayList<>());
        }
        for(int []a : edges){
            map.get(a[0]).add(a[1]);
            map.get(a[1]).add(a[0]);
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        HashSet<Integer> visited = new HashSet<>();
        while(!q.isEmpty()){
            int r = q.poll();
            if(visited.contains(r)) continue;
            visited.add(r);
            if(r == des) return true;
            for(int nbrs : map.get(r)){
                if(!visited.contains(nbrs)) q.add(nbrs);
            }
        }
        return false;
    }
}