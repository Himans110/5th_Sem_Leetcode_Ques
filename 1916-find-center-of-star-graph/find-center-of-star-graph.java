class Solution {
    public int findCenter(int[][] edges) {
        int n = edges.length;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 1; i <= n+1; i++) {
            map.put(i, new ArrayList<>());
        }
        for (int[] a : edges) {
            map.get(a[0]).add(a[1]);
            map.get(a[1]).add(a[0]);
        }
        for(int i : map.keySet()){
            if(map.get(i).size() == edges.length) return i;
        }
        return -1;
    }
}