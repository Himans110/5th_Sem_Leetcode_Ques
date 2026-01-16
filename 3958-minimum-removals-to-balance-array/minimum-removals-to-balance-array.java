class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 0;
        int l = 0;
        for(int r = 0 ; r < nums.length ; r++){
            while((long)nums[r] > (long)nums[l]*k){
                l++;
            }
            ans = Math.max(ans, r-l+1);
        }
        return nums.length-ans;
    }
}