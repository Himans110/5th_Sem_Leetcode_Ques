class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        int st = -1;
        int end = -1;
        for(int i = 0  ; i < nums.length ; i++){
            if(nums[i] == 0){
                if(st == -1){
                    st = i;
                }
                end = i;
                ans += (end-st)+1;
            }
            else{
                st = -1;
                end = -1;
            }
        }
        return ans;
    }
}