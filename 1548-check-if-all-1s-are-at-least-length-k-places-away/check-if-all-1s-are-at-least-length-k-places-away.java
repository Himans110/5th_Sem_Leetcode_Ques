class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int idx1 = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 1){
                idx1 = i;
                break;
            }
        }
        int c =0;
        for(int i = idx1+1 ; i < nums.length ; i++){
            if(nums[i] == 0){
                c++;
            }
            else{
                if(c < k) return false;
                c = 0;
            }
        }
        return true;
    }
}