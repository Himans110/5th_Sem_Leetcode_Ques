class Solution {
    public int longestSubarray(int[] nums) {
        int ans = 2;
        int max = 2;
        for(int i = 2; i < nums.length; i++){
            if(nums[i] == nums[i-1]+nums[i-2]){
                ans++;
            }
            else{
                max = Math.max(max, ans);
                ans = 2;
            }
        }
        max = Math.max(max, ans);
        return max; 
    }
}