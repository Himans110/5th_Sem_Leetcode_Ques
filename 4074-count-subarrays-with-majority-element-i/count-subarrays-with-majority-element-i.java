class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int ans = 0;
        for(int i =0 ; i < nums.length ; i++){
            int tc = 0;
            int any = 0;
            for(int j = i ; j < nums.length ; j++){
                if(nums[j] == target) tc++;
                else any++;
                if(tc > any) ans++;
            }
        }
        return ans;
    }
}