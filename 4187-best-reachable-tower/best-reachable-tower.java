class Solution {
    public int[] bestTower(int[][] arr, int[] c, int r) {
        List<Integer> l = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++){
            int dis = Math.abs(arr[i][0]-c[0])+Math.abs(arr[i][1]-c[1]);
            if(dis <= r) l.add((i));
        }
        Collections.sort(l,(a,b)->{
            if (arr[a][2] == arr[b][2]) {
            // compare x
                if (arr[a][0] == arr[b][0]) {
                    // if x same → compare y
                    return arr[a][1] - arr[b][1];
                }
                return arr[a][0] - arr[b][0];
            }
            return arr[b][2] - arr[a][2];
        });
        if(l.size() == 0) return new int[]{-1,-1};
        return new int[]{arr[l.get(0)][0],arr[l.get(0)][1]};
    }
}