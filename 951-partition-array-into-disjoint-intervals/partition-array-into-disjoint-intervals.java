class Solution {
    public int partitionDisjoint(int[] nums) {
        int n = nums.length;

        int[] maxl = new int[n];
        maxl[0] = nums[0];
        for(int i = 1; i < n; i++){
            maxl[i] = Math.max(nums[i], maxl[i-1]);
        }

        int[] minr = new int[n];
        minr[n-1] = nums[n-1];
        for(int i = n-2; i >= 0; i--){
            minr[i] = Math.min(nums[i], minr[i+1]);
        }
        for(int i = 0; i < n-1; i++){
            if(maxl[i] <= minr[i+1]){
                return i + 1;
            }
        }

        return -1;
    }
}