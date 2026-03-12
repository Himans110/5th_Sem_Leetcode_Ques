class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, -1);
        int ans = 0;
        int curr = 0;
        for(int i = 0; i <n ; i++){
            curr += nums[i] == 0 ? -1 : 1;
            if(map.containsKey(curr)){
                int idx = map.get(curr);
                ans = Math.max(ans, i-idx );
            }
            else{
                map.put(curr, i);
            }
        }
        return ans;
    }
}