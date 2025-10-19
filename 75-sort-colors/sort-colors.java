class Solution {
    public void sortColors(int[] nums) {
        int ans[] = new int[nums.length];
        int k = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0) ans[k++] = 0;
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 1) ans[k++] = 1;
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 2) ans[k++] = 2;
        }
        for(int i = 0 ; i < ans.length ; i++){
            nums[i] = ans[i];
        }
    }
}