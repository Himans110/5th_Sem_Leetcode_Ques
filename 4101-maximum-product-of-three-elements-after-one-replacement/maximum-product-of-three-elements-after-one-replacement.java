class Solution {
    public long maxProduct(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        return 1L *nums[nums.length-1]*nums[nums.length-2]*100000;
    }
}