class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        while(n != 1){
            n = n -1;
            int arr[] = new int[n];
            int k = 0;
            for(int i = 0 ; i < n ; i++){
                arr[k++] = (nums[i]+nums[i+1])% 10;
            }
            nums = arr;
        }
        return nums[0];
    }
}