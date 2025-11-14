class Solution {
    public int longestSubarray(int[] nums) {
        int c= 0;
        for(int i : nums){
            if(i == 1) c++;
        }
        if(c == nums.length) return c-1;
        int i = 0;
        int j = 0;
        int c0 = 0;
        int ans = 0;
        while(j < nums.length){
            if(nums[j] == 0) c0++;
            while(c0 > 1){
                if(nums[i] == 0) c0--;
                i++;
            }
            ans = Math.max(ans, (j-i)+1-c0);
            j++;
        }
        return ans;
    }
}