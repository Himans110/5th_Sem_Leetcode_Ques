class Solution {
    public boolean isNStraightHand(int[] nums, int k) {
        if(nums.length % k != 0) return false;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        while(!map.isEmpty()){
            int st = map.firstKey();
            for(int i = 0 ; i<k ; i++){
                int cur = st+i;
                if(!map.containsKey(cur)) return false;
                map.put(cur, map.get(cur)-1);
                if(map.get(cur) == 0){
                    map.remove(cur);
                }
            }
        }
        return true;
    }
}