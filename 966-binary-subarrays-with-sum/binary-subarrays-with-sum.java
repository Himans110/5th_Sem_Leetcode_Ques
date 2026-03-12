class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        int pre[] = new int [n];
        pre[0] = nums[0];
        for(int i =1; i < n; i++){
            pre[i] = pre[i-1]+nums[i];
        }
        HashMap<Integer,Integer> m = new HashMap<>();
        m.put(0, 1);
        int ans = 0;
        for(int i = 0; i <n ; i++){
            if(m.containsKey(pre[i]-goal)){
                ans += m.get(pre[i]-goal);
            }
            m.put(pre[i], m.getOrDefault(pre[i], 0)+1);
        }
        return ans;
    }
}