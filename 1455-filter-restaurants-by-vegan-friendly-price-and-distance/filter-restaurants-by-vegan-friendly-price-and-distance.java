class Solution {
    public List<Integer> filterRestaurants(int[][] r, int v, int mp, int md) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < r.length ; i++){
            if(v == 1){
                if(r[i][2] == 1 && r[i][3] <=mp && r[i][4] <= md){
                    map.put(r[i][0], r[i][1]);
                }
            }
            else{
                if(r[i][3] <=mp && r[i][4] <= md){
                    map.put(r[i][0], r[i][1]);
                }
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
       Collections.sort(list, (a, b) -> {
            if (!a.getValue().equals(b.getValue()))
                return b.getValue() - a.getValue();
            return b.getKey() - a.getKey();
        });
        List<Integer> ans = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : list) {
            ans.add(e.getKey());
        }
        return ans;
    }
}