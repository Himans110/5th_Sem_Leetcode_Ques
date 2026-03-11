class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
            int f = target-nums[i];
            if(!map.containsKey(f)){
                map.put(nums[i], i);
            }
            else{
                ans[0] = i+1;
                ans[1] = map.get(f)+1;
            }
        }
        Arrays.sort(ans);
        return ans;
    }
}