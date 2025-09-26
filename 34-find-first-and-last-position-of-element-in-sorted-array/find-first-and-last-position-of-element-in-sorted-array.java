class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findf(nums,target);
        int last = findl(nums,target);
        return new int[]{first,last};
    }
    public int findf(int []nums, int tar){
        int l = 0;
        int h = nums.length-1;
        int ans = -1;
        while(l <= h){
            int mid = l+(h-l)/2;
            if(nums[mid] == tar){
                ans = mid;
                h = mid-1;
            }
            else if(nums[mid] < tar){
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }
        return ans;
    }
    public int findl(int []nums, int tar){
        int l = 0;
        int h = nums.length-1;
        int ans = -1;
        while(l <= h){
            int mid = l+(h-l)/2;
            if(nums[mid] == tar){
                ans = mid;
                l = mid+1;
            }
            else if(nums[mid] < tar){
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }
        return ans;
    }
}