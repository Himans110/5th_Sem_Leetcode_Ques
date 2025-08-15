class Solution {
    public int[] getFinalState(int[] nums, int k, int mul) {
        while(k-- > 0){
            int idx = -1;
            int min = Integer.MAX_VALUE;
            for(int i = 0 ; i < nums.length ; i++){
                if(nums[i] < min){
                    min = nums[i];
                    idx = i;
                }
            }
            nums[idx] = min*mul;
        }
        return nums;
    }
}