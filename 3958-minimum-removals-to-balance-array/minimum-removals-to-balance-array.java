class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            int lo = i+1;
            int hi = n-1;
            int idx = -1;
            while(lo <= hi){
                int mid = lo+(hi-lo)/2;
                if((long)nums[mid] <= (long)nums[i]*k){
                    idx = mid;
                    lo = mid+1;
                }
                else{
                    hi = mid-1;
                }
            }
            if(idx == -1){
                ans = Math.min(ans , n-1);
            }
            else{
                ans = Math.min(ans, n-(idx-i+1));
            }
        }
        return ans;
    }
}