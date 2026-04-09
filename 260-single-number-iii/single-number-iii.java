class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i , map.getOrDefault(i , 0)+1);
        }
        int ans[] = new int[2];
        int j = 0;
        for(int k : map.keySet()){
            if(map.get(k) == 1){
                ans[j++] = k;
            }
        }
        return ans;
    }
}