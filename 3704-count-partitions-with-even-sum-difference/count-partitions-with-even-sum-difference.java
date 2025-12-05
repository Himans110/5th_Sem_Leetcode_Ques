class Solution {
    public int countPartitions(int[] nums) {
        int count = 0;
        for(int i = 0 ; i <nums.length-1 ; i++){
            int sum1 = sum(nums,0,i);
            int sum2 = sum(nums,i+1,nums.length-1);
            int sumdiff = Math.abs(sum1 - sum2);
            if(sumdiff % 2 == 0) count++;
        }
        return count;
    }
    private int sum(int []arr, int i , int j){
        int sum = 0;
        for(int s = i ; s <= j ; s++){
            sum += arr[s];
        }
        return sum;
    }
}