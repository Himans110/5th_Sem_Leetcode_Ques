class Solution {
    public int findChampion(int n, int[][] edges) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            map.put(i, new ArrayList<>());
        }
        for(int a[] : edges){
            map.get(a[0]).add(a[1]);
        }
        int in[] = new int[n];
        for(int v1 : map.keySet()){
            for(int v2 : map.get(v1)){
                in[v2]++;
            }
        }
        int count = 0;
        int ans = -1;
        for(int i = 0 ; i < in.length ; i++){
            if(in[i] == 0){
                count++;
                ans = i;
            }
        }
        if(count == 1) return ans;
        return -1;
    }
}