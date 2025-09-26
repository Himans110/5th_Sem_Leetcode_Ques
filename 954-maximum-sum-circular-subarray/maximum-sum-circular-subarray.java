class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum = 0;
        for(int i  = 0 ; i < nums.length ; i++){
            sum += nums[i];
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum1 = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sum1 += nums[i];
            min = Math.min(min,sum1);
            if(sum1 > 0){
                sum1 = 0;
            }
        }
        int sum2 = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sum2 += nums[i];
            max = Math.max(max,sum2);
            if(sum2 < 0){
                sum2 =0;
            }
        }
        if(sum - min == 0) return max;
        return Math.max(max , sum-min);
    }
}